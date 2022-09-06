package com.tcoding.demo.jpa;

import com.tcoding.demo.jpa.model.SysRole;
import com.tcoding.demo.jpa.model.SysUser;
import com.tcoding.demo.jpa.model.UserDetail;
import com.tcoding.demo.jpa.model.UserFile;
import com.tcoding.demo.jpa.repository.SysUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import javax.persistence.criteria.Predicate;
import javax.transaction.Transactional;

// @ExtendWith(SpringExtension.class)
@SpringBootTest
class JpaApplicationTests {

    @Autowired
    SysUserRepository sysUserRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    void repositorySaveTest() {
        SysUser sysUser = new SysUser();
        // sysUser.setId(20L);
        sysUser.setUserName("jpa");
        sysUser.setGroupId(1L);
        sysUser.setPassword("123456");
        sysUser.setPhoneNumber("123");

        UserFile file = new UserFile();
        file.setFileName("file name");
        UserFile file2 = new UserFile();
        file2.setFileName("file 2");

        // 必须设置
        file.setUser(sysUser);
        file2.setUser(sysUser);

        sysUser.setFiles(List.of(file, file2));

        SysRole role = new SysRole();
        role.setRoleName("role1");
        SysRole role2 = new SysRole();
        role2.setRoleName("role2");
        sysUser.setRoles(List.of(role, role2));

        UserDetail detail = new UserDetail();
        detail.setDetailInfo("detail");
        //可以不设置
        // detail.setUser(sysUser);
        sysUser.setUserDetail(detail);

        sysUserRepository.save(sysUser);
        System.out.println(sysUser.getId());
    }

    @Test
    void repositoryGetTest() {
        sysUserRepository.findByUserName("jpa").ifPresent(System.out::println);
    }

    @Test
    @Transactional
    void repositoryGetByIdTest() {
        SysUser user = sysUserRepository.getReferenceById(1L);
        System.out.println(user);
    }

    @Test
    void jpaExecutorTest() {
        System.out.println(sysUserRepository.findAll((Specification<SysUser>) (root, query, criteriaBuilder) -> {
            Predicate p1 = criteriaBuilder.equal(root.get("userName"), "jpa");
            Predicate p2 = criteriaBuilder.equal(root.get("password"), "123456");
            return criteriaBuilder.and(p1, p2);
        }));
    }

    @Test
    void delTest() {
        sysUserRepository.deleteById(66L);
    }
}

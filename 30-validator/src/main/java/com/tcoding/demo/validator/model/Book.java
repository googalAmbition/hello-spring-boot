package com.tcoding.demo.validator.model;

import com.tcoding.demo.validator.validator.annotation.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @NotNull(groups = {Update.class})
    @Null(groups = Save.class)
    private Integer id;

    @NotNull(groups = {Save.class, Update.class})
    private String name;

    @NotNull(groups = {Save.class, Update.class})
    @Size(min = 2, max = 10)
    private String author;

    @In(groups = {Save.class, Update.class}, value = {"math", "chinese"})
    private String category;

    @NotNull
    @Valid
    private Publish publish;

    public interface Save { }

    public interface Update { }

    @Data
    public static class Publish {

        private Integer id;

        @NotNull
        private String name;
    }
}



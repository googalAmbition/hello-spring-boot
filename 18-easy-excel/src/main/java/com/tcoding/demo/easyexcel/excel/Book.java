package com.tcoding.demo.easyexcel.excel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.alibaba.excel.enums.poi.FillPatternTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author 陈天成
 * @date 2022/10/13.
 */
@Data
// 宽度行高设置
@ColumnWidth(50)
@HeadRowHeight(50)
@ContentRowHeight(100)
// 样式设置
@HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 14)
@HeadFontStyle(fontHeightInPoints = 20, color = 15)
@ContentStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 17)
@ContentFontStyle(fontHeightInPoints = 30, color = 22)
public class Book {

    @ExcelIgnore
    private Long id;

    @ExcelProperty(value = "书名", index = 1)
    private String name;

    @DateTimeFormat("yyyy年MM月dd")
    @ExcelProperty(value = "出版日期", index = 2)
    private Date pushDate;

    @ExcelProperty(value = "价格", index = 3)
    private Double price;
}


package top.thezhi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZHI LIU
 * @date 2022-11-21
 *
 * 基本信息表
 * 只显示 图片 宠物名称 系别
 * 在主页上就显示这些信息
 *
 */

@Data
@NoArgsConstructor
@TableName("base_info")
public class BaseInfo {
    private int id;
    private String name;
    private String nature;
    private String img;
}

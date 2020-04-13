package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data     //为每个属性生成set和get方法
@NoArgsConstructor   //空参的构造函数
@AllArgsConstructor   //全参的构造函数
@Accessors(chain = true)   //链式风格访问
public class Comm implements Serializable{
    private  String  id;
    private  String  store;
}

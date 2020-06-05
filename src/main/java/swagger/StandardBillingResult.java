package swagger;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhouzhiliang on 2018/9/7.
 */
@Data
public class StandardBillingResult implements Serializable {

    private String customerCode;
    private String businessNo;
    private Date expDate;
    private Double totalAmount;
    private String contractNo;
    /**
     * 折前总金额
     */
    private Double totalPreAmount;


    //计费重量
    private BigDecimal weight;
    //计费体积
    private BigDecimal volume;
    //计费类型 : 暂无具体类型，默认返回2。青龙测枚举： 0重量、1体积 、2泡重比
    private Integer computeType = 2;

    //计泡系数
    private BigDecimal bubbleRatio;
    //0其它、1重货 、2泡货
    private Integer heavyBubbleType = 0;

    private BigDecimal calWeight;

}

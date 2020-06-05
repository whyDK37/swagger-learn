package swagger;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;

@Data
public class LargePiecePriceRequest {


    @NotBlank(message = "来源系统为空")
    private String systemSource;

    @NotBlank(message = "单据类型为空")
    private String orderType;

    @NotBlank(message = "交易类型为空")
    private String transactionType;

    @NotBlank(message = "商家编码为空")
    private String sellerNo;

    @NotBlank(message = "订单编号为空")
    private String businessNo;

    @NotNull(message = "计费日期为空")
    private Date expDate;

    @NotNull(message = "计费产品为空")
    private String productCode;

    @NotNull(message = "总重量为空")
    private Double weight;

    @NotNull(message = "总体积为空")
    private Double volume;

    @NotNull(message = "总件数为空")
    private Integer qty;

    @NotNull(message = "是否保价为空")
    private Byte isInsured = 0;

    /**
     * 保价金额
     */
    private Double insuredValue = 0.0;

    /**
     * 是否代收货款 1收取，0不收取
     */
    @NotNull(message = "是否代收货款为空")
    private Byte isCodService = 0;

    /**
     * 代收金额
     */
    private Double codMoney = 0.0;

    /**
     * 是否协商再投
     */
    private Byte isConsultBill;

    /**
     * 协商再投次数
     */
    private Integer deliverTimes;

    /**
     * 签单返还
     */
    @NotNull(message = "签单返还为空")
    private Byte isReceiptCollectService = 0;

    /**
     * 签单类型 1 签单原单返，3 签单照片，4 原单+签单
     */
    private Byte largeReceiptCollectType;

    /**
     * 始发县编号.
     */
    //@NotBlank(message = "始发县编号为空")
    private String startCountyCode;

    /**
     * 始发市编号.
     */
    @NotBlank(message = "始发城市编号为空")
    private String startCityCode;

    /**
     * 始发省编号.
     */
    @NotBlank(message = "始发省编号为空")
    private String startProvinceCode;

    /**
     * 目的地县编号.
     */
    //@NotBlank(message = "目的地县编号为空")
    private String destCountyCode;

    /**
     * 目的地市编号.
     */
    @NotBlank(message = "目的地市编号为空")
    private String destCityCode;

    /**
     * 目的地省编号.
     */
    @NotBlank(message = "目的地省编号为空")
    private String destProvinceCode;

    /**
     * 运输方式
     */
    private Byte transportMode;

    /**
     * 车型
     */
    private String vehicleType;

    /**
     * key 件型, value 数量
     */
    private Map<String, Integer> warpTypeCount;

    /**
     * 单据状态 默认写成'妥投'
     */
    private Integer billStatus = 1;

}

package com.huawei.hms.iap.entity;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes7.dex */
public class ProductInfo implements IMessageEntity {

    @Packed
    private String currency;

    @Packed
    private long microsPrice;

    @Packed
    private int offerUsedStatus = -1;

    @Packed
    private String originalLocalPrice;

    @Packed
    private long originalMicroPrice;

    @Packed
    private String price;

    @Packed
    private int priceType;

    @Packed
    private String productDesc;

    @Packed
    private String productId;

    @Packed
    private String productName;

    @Packed
    private int status;

    @Packed
    private String subFreeTrialPeriod;

    @Packed
    private String subGroupId;

    @Packed
    private String subGroupTitle;

    @Packed
    private String subPeriod;

    @Packed
    private int subProductLevel;

    @Packed
    private String subSpecialPeriod;

    @Packed
    private int subSpecialPeriodCycles;

    @Packed
    private String subSpecialPrice;

    @Packed
    private long subSpecialPriceMicros;

    public String getCurrency() {
        return this.currency;
    }

    public long getMicrosPrice() {
        return this.microsPrice;
    }

    public int getOfferUsedStatus() {
        return this.offerUsedStatus;
    }

    public String getOriginalLocalPrice() {
        return this.originalLocalPrice;
    }

    public long getOriginalMicroPrice() {
        return this.originalMicroPrice;
    }

    public String getPrice() {
        return this.price;
    }

    public int getPriceType() {
        return this.priceType;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getSubFreeTrialPeriod() {
        return this.subFreeTrialPeriod;
    }

    public String getSubGroupId() {
        return this.subGroupId;
    }

    public String getSubGroupTitle() {
        return this.subGroupTitle;
    }

    public String getSubPeriod() {
        return this.subPeriod;
    }

    public int getSubProductLevel() {
        return this.subProductLevel;
    }

    public String getSubSpecialPeriod() {
        return this.subSpecialPeriod;
    }

    public int getSubSpecialPeriodCycles() {
        return this.subSpecialPeriodCycles;
    }

    public String getSubSpecialPrice() {
        return this.subSpecialPrice;
    }

    public long getSubSpecialPriceMicros() {
        return this.subSpecialPriceMicros;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setMicrosPrice(long j11) {
        this.microsPrice = j11;
    }

    public void setOfferUsedStatus(int i11) {
        this.offerUsedStatus = i11;
    }

    public void setOriginalLocalPrice(String str) {
        this.originalLocalPrice = str;
    }

    public void setOriginalMicroPrice(long j11) {
        this.originalMicroPrice = j11;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setPriceType(int i11) {
        this.priceType = i11;
    }

    public void setProductDesc(String str) {
        this.productDesc = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setStatus(int i11) {
        this.status = i11;
    }

    public void setSubFreeTrialPeriod(String str) {
        this.subFreeTrialPeriod = str;
    }

    public void setSubGroupId(String str) {
        this.subGroupId = str;
    }

    public void setSubGroupTitle(String str) {
        this.subGroupTitle = str;
    }

    public void setSubPeriod(String str) {
        this.subPeriod = str;
    }

    public void setSubProductLevel(int i11) {
        this.subProductLevel = i11;
    }

    public void setSubSpecialPeriod(String str) {
        this.subSpecialPeriod = str;
    }

    public void setSubSpecialPeriodCycles(int i11) {
        this.subSpecialPeriodCycles = i11;
    }

    public void setSubSpecialPrice(String str) {
        this.subSpecialPrice = str;
    }

    public void setSubSpecialPriceMicros(long j11) {
        this.subSpecialPriceMicros = j11;
    }
}

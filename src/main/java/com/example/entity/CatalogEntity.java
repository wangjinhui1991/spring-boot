package com.example.entity;

import java.util.Date;

public class CatalogEntity {
    private Integer cataLogId;

    private String cataLogTitle;

    private Integer offerId;

    private Integer userId;

    private String offerName;

    private String offerDescrip;

    private String offerImg;

    private Float offerImgWidth;

    private Float offerImgHeight;

    private String offerVoice;

    private String offerBuyPrice;

    private String offerSellPrice;

    private String offerBuyCry;

    private String offerSellCry;

    private String offerCurrency;

    private String offerUnit;

    private String offerArrSheet;

    private Integer chooseType;

    private String chooseUserId;

    private String chooseTagId;

    private Integer contactStatus;

    private Integer contactUserId;

    private String contactName;

    private String contactImg;

    private String contactEmail;

    private String contactCompany;

    private String contactTel;

    private Date makeOfferTime;

    private Integer delStatus;

    private Date updateTime;

    private Date createTime;

    private String offerNo;

    public Integer getCataLogId() {
        return cataLogId;
    }

    public void setCataLogId(Integer cataLogId) {
        this.cataLogId = cataLogId;
    }

    public String getCataLogTitle() {
        return cataLogTitle;
    }

    public void setCataLogTitle(String cataLogTitle) {
        this.cataLogTitle = cataLogTitle == null ? null : cataLogTitle.trim();
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName == null ? null : offerName.trim();
    }

    public String getOfferDescrip() {
        return offerDescrip;
    }

    public void setOfferDescrip(String offerDescrip) {
        this.offerDescrip = offerDescrip == null ? null : offerDescrip.trim();
    }

    public String getOfferImg() {
        return offerImg;
    }

    public void setOfferImg(String offerImg) {
        this.offerImg = offerImg == null ? null : offerImg.trim();
    }

    public Float getOfferImgWidth() {
        return offerImgWidth;
    }

    public void setOfferImgWidth(Float offerImgWidth) {
        this.offerImgWidth = offerImgWidth;
    }

    public Float getOfferImgHeight() {
        return offerImgHeight;
    }

    public void setOfferImgHeight(Float offerImgHeight) {
        this.offerImgHeight = offerImgHeight;
    }

    public String getOfferVoice() {
        return offerVoice;
    }

    public void setOfferVoice(String offerVoice) {
        this.offerVoice = offerVoice == null ? null : offerVoice.trim();
    }

    public String getOfferBuyPrice() {
        return offerBuyPrice;
    }

    public void setOfferBuyPrice(String offerBuyPrice) {
        this.offerBuyPrice = offerBuyPrice == null ? null : offerBuyPrice.trim();
    }

    public String getOfferSellPrice() {
        return offerSellPrice;
    }

    public void setOfferSellPrice(String offerSellPrice) {
        this.offerSellPrice = offerSellPrice == null ? null : offerSellPrice.trim();
    }

    public String getOfferBuyCry() {
        return offerBuyCry;
    }

    public void setOfferBuyCry(String offerBuyCry) {
        this.offerBuyCry = offerBuyCry == null ? null : offerBuyCry.trim();
    }

    public String getOfferSellCry() {
        return offerSellCry;
    }

    public void setOfferSellCry(String offerSellCry) {
        this.offerSellCry = offerSellCry == null ? null : offerSellCry.trim();
    }

    public String getOfferCurrency() {
        return offerCurrency;
    }

    public void setOfferCurrency(String offerCurrency) {
        this.offerCurrency = offerCurrency == null ? null : offerCurrency.trim();
    }

    public String getOfferUnit() {
        return offerUnit;
    }

    public void setOfferUnit(String offerUnit) {
        this.offerUnit = offerUnit == null ? null : offerUnit.trim();
    }

    public String getOfferArrSheet() {
        return offerArrSheet;
    }

    public void setOfferArrSheet(String offerArrSheet) {
        this.offerArrSheet = offerArrSheet == null ? null : offerArrSheet.trim();
    }

    public Integer getChooseType() {
        return chooseType;
    }

    public void setChooseType(Integer chooseType) {
        this.chooseType = chooseType;
    }

    public String getChooseUserId() {
        return chooseUserId;
    }

    public void setChooseUserId(String chooseUserId) {
        this.chooseUserId = chooseUserId == null ? null : chooseUserId.trim();
    }

    public String getChooseTagId() {
        return chooseTagId;
    }

    public void setChooseTagId(String chooseTagId) {
        this.chooseTagId = chooseTagId == null ? null : chooseTagId.trim();
    }

    public Integer getContactStatus() {
        return contactStatus;
    }

    public void setContactStatus(Integer contactStatus) {
        this.contactStatus = contactStatus;
    }

    public Integer getContactUserId() {
        return contactUserId;
    }

    public void setContactUserId(Integer contactUserId) {
        this.contactUserId = contactUserId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactImg() {
        return contactImg;
    }

    public void setContactImg(String contactImg) {
        this.contactImg = contactImg == null ? null : contactImg.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getContactCompany() {
        return contactCompany;
    }

    public void setContactCompany(String contactCompany) {
        this.contactCompany = contactCompany == null ? null : contactCompany.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public Date getMakeOfferTime() {
        return makeOfferTime;
    }

    public void setMakeOfferTime(Date makeOfferTime) {
        this.makeOfferTime = makeOfferTime;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOfferNo() {
        return offerNo;
    }

    public void setOfferNo(String offerNo) {
        this.offerNo = offerNo == null ? null : offerNo.trim();
    }
}
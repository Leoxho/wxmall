package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOrderGuser<M extends BaseOrderGuser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setGheaderId(java.lang.Long gheaderId) {
		set("gheader_id", gheaderId);
		return (M)this;
	}

	public java.lang.Long getGheaderId() {
		return get("gheader_id");
	}

	public M setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
		return (M)this;
	}

	public java.lang.Long getBuyerId() {
		return get("buyer_id");
	}

	public M setReceiverId(java.lang.Long receiverId) {
		set("receiver_id", receiverId);
		return (M)this;
	}

	public java.lang.Long getReceiverId() {
		return get("receiver_id");
	}

	public M setPrice(java.math.BigDecimal price) {
		set("price", price);
		return (M)this;
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public M setQuantity(java.lang.Integer quantity) {
		set("quantity", quantity);
		return (M)this;
	}

	public java.lang.Integer getQuantity() {
		return get("quantity");
	}

	public M setSpecValue(java.lang.String specValue) {
		set("spec_value", specValue);
		return (M)this;
	}

	public java.lang.String getSpecValue() {
		return get("spec_value");
	}

	public M setPostFee(java.math.BigDecimal postFee) {
		set("post_fee", postFee);
		return (M)this;
	}

	public java.math.BigDecimal getPostFee() {
		return get("post_fee");
	}

	public M setPayFee(java.math.BigDecimal payFee) {
		set("pay_fee", payFee);
		return (M)this;
	}

	public java.math.BigDecimal getPayFee() {
		return get("pay_fee");
	}

	public M setPaymentStatus(java.lang.Integer paymentStatus) {
		set("payment_status", paymentStatus);
		return (M)this;
	}

	public java.lang.Integer getPaymentStatus() {
		return get("payment_status");
	}

	public M setMemo(java.lang.String memo) {
		set("memo", memo);
		return (M)this;
	}

	public java.lang.String getMemo() {
		return get("memo");
	}

	public M setTradeNo(java.lang.String tradeNo) {
		set("trade_no", tradeNo);
		return (M)this;
	}

	public java.lang.String getTradeNo() {
		return get("trade_no");
	}

	public M setTransactionId(java.lang.String transactionId) {
		set("transaction_id", transactionId);
		return (M)this;
	}

	public java.lang.String getTransactionId() {
		return get("transaction_id");
	}

	public M setActive(java.lang.Boolean active) {
		set("active", active);
		return (M)this;
	}

	public java.lang.Boolean getActive() {
		return get("active");
	}

	public M setCreated(java.util.Date created) {
		set("created", created);
		return (M)this;
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public M setUpdated(java.util.Date updated) {
		set("updated", updated);
		return (M)this;
	}

	public java.util.Date getUpdated() {
		return get("updated");
	}

}
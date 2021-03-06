package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLotteryRecord<M extends BaseLotteryRecord<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
		return (M)this;
	}

	public java.lang.Long getBuyerId() {
		return get("buyer_id");
	}

	public M setLotteryId(java.lang.Long lotteryId) {
		set("lottery_id", lotteryId);
		return (M)this;
	}

	public java.lang.Long getLotteryId() {
		return get("lottery_id");
	}

	public M setLotteryTime(java.util.Date lotteryTime) {
		set("lottery_time", lotteryTime);
		return (M)this;
	}

	public java.util.Date getLotteryTime() {
		return get("lottery_time");
	}

	public M setLotteryMonth(java.lang.String lotteryMonth) {
		set("lottery_month", lotteryMonth);
		return (M)this;
	}

	public java.lang.String getLotteryMonth() {
		return get("lottery_month");
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

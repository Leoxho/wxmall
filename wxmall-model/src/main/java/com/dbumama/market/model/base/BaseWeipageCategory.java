package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWeipageCategory<M extends BaseWeipageCategory<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setSellerId(java.lang.Long sellerId) {
		set("seller_id", sellerId);
		return (M)this;
	}

	public java.lang.Long getSellerId() {
		return get("seller_id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("name");
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

	public M setOrders(java.lang.Integer orders) {
		set("orders", orders);
		return (M)this;
	}

	public java.lang.Integer getOrders() {
		return get("orders");
	}

}
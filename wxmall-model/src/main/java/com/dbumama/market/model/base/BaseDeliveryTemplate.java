package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDeliveryTemplate<M extends BaseDeliveryTemplate<M>> extends Model<M> implements IBean {

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

	public M setValuationType(java.lang.Long valuationType) {
		set("valuation_type", valuationType);
		return (M)this;
	}

	public java.lang.Long getValuationType() {
		return get("valuation_type");
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

	public M setActive(java.lang.Integer active) {
		set("active", active);
		return (M)this;
	}

	public java.lang.Integer getActive() {
		return get("active");
	}

}
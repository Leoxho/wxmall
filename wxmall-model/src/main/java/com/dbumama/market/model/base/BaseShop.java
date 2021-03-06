package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseShop<M extends BaseShop<M>> extends Model<M> implements IBean {

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

	public M setShopName(java.lang.String shopName) {
		set("shop_name", shopName);
		return (M)this;
	}

	public java.lang.String getShopName() {
		return get("shop_name");
	}

	public M setShopLogo(java.lang.String shopLogo) {
		set("shop_logo", shopLogo);
		return (M)this;
	}

	public java.lang.String getShopLogo() {
		return get("shop_logo");
	}

	public M setShopSign(java.lang.String shopSign) {
		set("shop_sign", shopSign);
		return (M)this;
	}

	public java.lang.String getShopSign() {
		return get("shop_sign");
	}

	public M setShopContact(java.lang.String shopContact) {
		set("shop_contact", shopContact);
		return (M)this;
	}

	public java.lang.String getShopContact() {
		return get("shop_contact");
	}

	public M setShopContactPhone(java.lang.String shopContactPhone) {
		set("shop_contact_phone", shopContactPhone);
		return (M)this;
	}

	public java.lang.String getShopContactPhone() {
		return get("shop_contact_phone");
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

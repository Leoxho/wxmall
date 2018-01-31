package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRole<M extends BaseRole<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("name");
	}

	public M setValue(java.lang.String value) {
		set("value", value);
		return (M)this;
	}

	public java.lang.String getValue() {
		return get("value");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public M setIsSystem(java.lang.Boolean isSystem) {
		set("is_system", isSystem);
		return (M)this;
	}

	public java.lang.Boolean getIsSystem() {
		return get("is_system");
	}

	public M setCreateBy(java.lang.String createBy) {
		set("create_by", createBy);
		return (M)this;
	}

	public java.lang.String getCreateBy() {
		return get("create_by");
	}

	public M setCreationDate(java.util.Date creationDate) {
		set("creation_date", creationDate);
		return (M)this;
	}

	public java.util.Date getCreationDate() {
		return get("creation_date");
	}

	public M setLastUpdatedBy(java.lang.String lastUpdatedBy) {
		set("last_updated_by", lastUpdatedBy);
		return (M)this;
	}

	public java.lang.String getLastUpdatedBy() {
		return get("last_updated_by");
	}

	public M setLastUpdatedDate(java.util.Date lastUpdatedDate) {
		set("last_updated_date", lastUpdatedDate);
		return (M)this;
	}

	public java.util.Date getLastUpdatedDate() {
		return get("last_updated_date");
	}

	public M setDeleteFlag(java.lang.Boolean deleteFlag) {
		set("delete_flag", deleteFlag);
		return (M)this;
	}

	public java.lang.Boolean getDeleteFlag() {
		return get("delete_flag");
	}

}
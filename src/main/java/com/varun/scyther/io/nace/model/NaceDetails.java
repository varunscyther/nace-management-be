package com.varun.scyther.io.nace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class NaceDetails {

    public @Id
    @GeneratedValue Long id;

    public Long orderNo;
    public int level;
    public String code;
    public String parent;
    @Column(length = 500)
    public String description;
    @Column(length = 1000)
    public String itemIncluded;
    @Column(length = 1000)
    public String additionalItemInclude;
    public String rulings;
    @Column(length = 1000)
    public String itemExcluded;
    public String referenceToISICRev4;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemIncluded() {
        return itemIncluded;
    }

    public void setItemIncluded(String itemIncluded) {
        this.itemIncluded = itemIncluded;
    }

    public String getAdditionalItemInclude() {
        return additionalItemInclude;
    }

    public void setAdditionalItemInclude(String additionalItemInclude) {
        this.additionalItemInclude = additionalItemInclude;
    }

    public String getRulings() {
        return rulings;
    }

    public void setRulings(String rulings) {
        this.rulings = rulings;
    }

    public String getItemExcluded() {
        return itemExcluded;
    }

    public void setItemExcluded(String itemExcluded) {
        this.itemExcluded = itemExcluded;
    }

    public String getReferenceToISICRev4() {
        return referenceToISICRev4;
    }

    public void setReferenceToISICRev4(String referenceToISICRev4) {
        this.referenceToISICRev4 = referenceToISICRev4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaceDetails)) return false;
        NaceDetails that = (NaceDetails) o;
        return getLevel() == that.getLevel() && Objects.equals(getId(), that.getId()) && Objects.equals(getOrderNo(), that.getOrderNo()) && Objects.equals(getCode(), that.getCode()) && Objects.equals(getParent(), that.getParent()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getItemIncluded(), that.getItemIncluded()) && Objects.equals(getAdditionalItemInclude(), that.getAdditionalItemInclude()) && Objects.equals(getRulings(), that.getRulings()) && Objects.equals(getItemExcluded(), that.getItemExcluded()) && Objects.equals(getReferenceToISICRev4(), that.getReferenceToISICRev4());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOrderNo(), getLevel(), getCode(), getParent(), getDescription(), getItemIncluded(), getAdditionalItemInclude(), getRulings(), getItemExcluded(), getReferenceToISICRev4());
    }

    @Override
    public String toString() {
        return "NaceDetails{" +
                "id=" + id +
                ", orderNo=" + orderNo +
                ", level=" + level +
                ", code='" + code + '\'' +
                ", parent='" + parent + '\'' +
                ", description='" + description + '\'' +
                ", itemIncluded='" + itemIncluded + '\'' +
                ", additionalItemInclude='" + additionalItemInclude + '\'' +
                ", rulings='" + rulings + '\'' +
                ", itemExcluded='" + itemExcluded + '\'' +
                ", referenceToISICRev4='" + referenceToISICRev4 + '\'' +
                '}';
    }
}

package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "FRAMEWORKFOLDERSMETADEFAULTS")
@NamedQueries({ @NamedQuery(name = "FrameworkFoldersMetaDefaults.findAll", query = "select o from FrameworkFoldersMetaDefaults o"),
                @NamedQuery(name ="FrameworkFoldersMetaDefaults.findByFfolderguid", 
                            query ="select o from FrameworkFoldersMetaDefaults o where o.ffolderguid = :ffolderguid"),
                @NamedQuery(name ="FrameworkFoldersMetaDefaults.findByFfolderguidAndFfieldnames", 
                            query ="select o from FrameworkFoldersMetaDefaults o where o.ffolderguid = :ffolderguid and o.ffieldname in (:ffieldnames)")})
public class FrameworkFoldersMetaDefaults implements Serializable{
    @SuppressWarnings("compatibility:277490941430682232")
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="FFOLDERGUID", length= 255)  
    private String ffolderguid;
    @Id
    @Column(name="FFIELDNAME", length= 100)  
    private String ffieldname;
    @Column(name="FFIELDTYPE", length= 50)   
    private String ffieldtype;
    @Column(name="FTABLENAME", length= 100)  
    private String ftablename;
    @Column(name="FFIELDVALUE", length= 2000) 
    private String ffieldvalue;
    
    public FrameworkFoldersMetaDefaults() {
        super();
    }


    public void setFfolderguid(String ffolderguid) {
        this.ffolderguid = ffolderguid;
    }

    public String getFfolderguid() {
        return ffolderguid;
    }

    public void setFfieldname(String ffieldname) {
        this.ffieldname = ffieldname;
    }

    public String getFfieldname() {
        return ffieldname;
    }

    public void setFfieldtype(String ffieldtype) {
        this.ffieldtype = ffieldtype;
    }

    public String getFfieldtype() {
        return ffieldtype;
    }

    public void setFtablename(String ftablename) {
        this.ftablename = ftablename;
    }

    public String getFtablename() {
        return ftablename;
    }

    public void setFfieldvalue(String ffieldvalue) {
        this.ffieldvalue = ffieldvalue;
    }

    public String getFfieldvalue() {
        return ffieldvalue;
    }
}

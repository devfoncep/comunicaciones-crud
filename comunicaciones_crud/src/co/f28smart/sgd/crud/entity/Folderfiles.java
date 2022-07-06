package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Folderfiles.findAll", query = "select o from Folderfiles o") })
public class Folderfiles implements Serializable {
    private static final long serialVersionUID = 1965112568148788514L;
    @Column(length = 100)
    private String ddocname;
    private BigDecimal dpublishedrevisionid;
    @Column(nullable = false)
    private BigDecimal drevisionid;
    @Column(nullable = false, length = 100)
    private String fapplication;
    @Column(length = 2000)
    private String fclbraaliaslist;
    @Column(length = 2000)
    private String fclbrarolelist;
    @Column(length = 2000)
    private String fclbrauserlist;
    @Column(nullable = false)
    private Timestamp fcreatedate;
    @Column(nullable = false, length = 200)
    private String fcreator;
    @Column(length = 80)
    private String fdocaccount;
    @Column(length = 100)
    private String fdocclass;
    @Id
    @Column(nullable = false)
    private String ffileguid;
    @Column(nullable = false)
    private String ffilename;
    @Column(nullable = false, length = 50)
    private String ffiletype;
    @Column(nullable = false)
    private BigDecimal finhibitpropagation;
    private BigDecimal fisaclreadonlyonui;
    private BigDecimal fisintrash;
    @Column(nullable = false)
    private Timestamp flastmodifieddate;
    @Column(nullable = false, length = 200)
    private String flastmodifier;
    @Column(nullable = false, length = 200)
    private String fowner;
    @Column(nullable = false)
    private String fparentguid;
    private String fpublishedfilename;
    private String frealitemguid;
    @Column(nullable = false, length = 30)
    private String fsecuritygroup;
    private String ftargetguid;

    public Folderfiles() {
    }

    public Folderfiles(String ddocname, BigDecimal dpublishedrevisionid, BigDecimal drevisionid, String fapplication,
                       String fclbraaliaslist, String fclbrarolelist, String fclbrauserlist, Timestamp fcreatedate,
                       String fcreator, String fdocaccount, String fdocclass, String ffileguid, String ffilename,
                       String ffiletype, BigDecimal finhibitpropagation, BigDecimal fisaclreadonlyonui,
                       BigDecimal fisintrash, Timestamp flastmodifieddate, String flastmodifier, String fowner,
                       String fparentguid, String fpublishedfilename, String frealitemguid, String fsecuritygroup,
                       String ftargetguid) {
        this.ddocname = ddocname;
        this.dpublishedrevisionid = dpublishedrevisionid;
        this.drevisionid = drevisionid;
        this.fapplication = fapplication;
        this.fclbraaliaslist = fclbraaliaslist;
        this.fclbrarolelist = fclbrarolelist;
        this.fclbrauserlist = fclbrauserlist;
        this.fcreatedate = fcreatedate;
        this.fcreator = fcreator;
        this.fdocaccount = fdocaccount;
        this.fdocclass = fdocclass;
        this.ffileguid = ffileguid;
        this.ffilename = ffilename;
        this.ffiletype = ffiletype;
        this.finhibitpropagation = finhibitpropagation;
        this.fisaclreadonlyonui = fisaclreadonlyonui;
        this.fisintrash = fisintrash;
        this.flastmodifieddate = flastmodifieddate;
        this.flastmodifier = flastmodifier;
        this.fowner = fowner;
        this.fparentguid = fparentguid;
        this.fpublishedfilename = fpublishedfilename;
        this.frealitemguid = frealitemguid;
        this.fsecuritygroup = fsecuritygroup;
        this.ftargetguid = ftargetguid;
    }

    public String getDdocname() {
        return ddocname;
    }

    public void setDdocname(String ddocname) {
        this.ddocname = ddocname;
    }

    public BigDecimal getDpublishedrevisionid() {
        return dpublishedrevisionid;
    }

    public void setDpublishedrevisionid(BigDecimal dpublishedrevisionid) {
        this.dpublishedrevisionid = dpublishedrevisionid;
    }

    public BigDecimal getDrevisionid() {
        return drevisionid;
    }

    public void setDrevisionid(BigDecimal drevisionid) {
        this.drevisionid = drevisionid;
    }

    public String getFapplication() {
        return fapplication;
    }

    public void setFapplication(String fapplication) {
        this.fapplication = fapplication;
    }

    public String getFclbraaliaslist() {
        return fclbraaliaslist;
    }

    public void setFclbraaliaslist(String fclbraaliaslist) {
        this.fclbraaliaslist = fclbraaliaslist;
    }

    public String getFclbrarolelist() {
        return fclbrarolelist;
    }

    public void setFclbrarolelist(String fclbrarolelist) {
        this.fclbrarolelist = fclbrarolelist;
    }

    public String getFclbrauserlist() {
        return fclbrauserlist;
    }

    public void setFclbrauserlist(String fclbrauserlist) {
        this.fclbrauserlist = fclbrauserlist;
    }

    public Timestamp getFcreatedate() {
        return fcreatedate;
    }

    public void setFcreatedate(Timestamp fcreatedate) {
        this.fcreatedate = fcreatedate;
    }

    public String getFcreator() {
        return fcreator;
    }

    public void setFcreator(String fcreator) {
        this.fcreator = fcreator;
    }

    public String getFdocaccount() {
        return fdocaccount;
    }

    public void setFdocaccount(String fdocaccount) {
        this.fdocaccount = fdocaccount;
    }

    public String getFdocclass() {
        return fdocclass;
    }

    public void setFdocclass(String fdocclass) {
        this.fdocclass = fdocclass;
    }

    public String getFfileguid() {
        return ffileguid;
    }

    public void setFfileguid(String ffileguid) {
        this.ffileguid = ffileguid;
    }

    public String getFfilename() {
        return ffilename;
    }

    public void setFfilename(String ffilename) {
        this.ffilename = ffilename;
    }

    public String getFfiletype() {
        return ffiletype;
    }

    public void setFfiletype(String ffiletype) {
        this.ffiletype = ffiletype;
    }

    public BigDecimal getFinhibitpropagation() {
        return finhibitpropagation;
    }

    public void setFinhibitpropagation(BigDecimal finhibitpropagation) {
        this.finhibitpropagation = finhibitpropagation;
    }

    public BigDecimal getFisaclreadonlyonui() {
        return fisaclreadonlyonui;
    }

    public void setFisaclreadonlyonui(BigDecimal fisaclreadonlyonui) {
        this.fisaclreadonlyonui = fisaclreadonlyonui;
    }

    public BigDecimal getFisintrash() {
        return fisintrash;
    }

    public void setFisintrash(BigDecimal fisintrash) {
        this.fisintrash = fisintrash;
    }

    public Timestamp getFlastmodifieddate() {
        return flastmodifieddate;
    }

    public void setFlastmodifieddate(Timestamp flastmodifieddate) {
        this.flastmodifieddate = flastmodifieddate;
    }

    public String getFlastmodifier() {
        return flastmodifier;
    }

    public void setFlastmodifier(String flastmodifier) {
        this.flastmodifier = flastmodifier;
    }

    public String getFowner() {
        return fowner;
    }

    public void setFowner(String fowner) {
        this.fowner = fowner;
    }

    public String getFparentguid() {
        return fparentguid;
    }

    public void setFparentguid(String fparentguid) {
        this.fparentguid = fparentguid;
    }

    public String getFpublishedfilename() {
        return fpublishedfilename;
    }

    public void setFpublishedfilename(String fpublishedfilename) {
        this.fpublishedfilename = fpublishedfilename;
    }

    public String getFrealitemguid() {
        return frealitemguid;
    }

    public void setFrealitemguid(String frealitemguid) {
        this.frealitemguid = frealitemguid;
    }

    public String getFsecuritygroup() {
        return fsecuritygroup;
    }

    public void setFsecuritygroup(String fsecuritygroup) {
        this.fsecuritygroup = fsecuritygroup;
    }

    public String getFtargetguid() {
        return ftargetguid;
    }

    public void setFtargetguid(String ftargetguid) {
        this.ftargetguid = ftargetguid;
    }
}

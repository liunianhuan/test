package com.pingjia.pojo;

import java.io.Serializable;
import java.util.Date;

public class Evaluate implements Serializable {
    private Integer id;

    private String uCardno;

    private String uUsername;

    private String content;

    private Date contentCreatedTime;

    private Date contentUpdateTime;

    private String cCardno;

    private String eName;

    private Integer eFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuCardno() {
        return uCardno;
    }

    public void setuCardno(String uCardno) {
        this.uCardno = uCardno == null ? null : uCardno.trim();
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getContentCreatedTime() {
        return contentCreatedTime;
    }

    public void setContentCreatedTime(Date contentCreatedTime) {
        this.contentCreatedTime = contentCreatedTime;
    }

    public Date getContentUpdateTime() {
        return contentUpdateTime;
    }

    public void setContentUpdateTime(Date contentUpdateTime) {
        this.contentUpdateTime = contentUpdateTime;
    }

    public String getcCardno() {
        return cCardno;
    }

    public void setcCardno(String cCardno) {
        this.cCardno = cCardno == null ? null : cCardno.trim();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Integer geteFlag() {
        return eFlag;
    }

    public void seteFlag(Integer eFlag) {
        this.eFlag = eFlag;
    }
}
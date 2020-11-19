package org.aarboard.nextcloud.api.provisioning;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author lianghongpeng
 */
@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateUser {
    private String userid;
    private String password;

    private String displayName;

    private String email;


    /**
     * en
     */
    private String language;

    private List<String> subadmin;

    /**
     * 10 GB
     */
    private String quota;

    @XmlElementWrapper(name = "groups")
    @XmlElement(name = "element")
    private List<String> groups;
}


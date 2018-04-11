/*
 * This file is generated by jOOQ.
*/
package pl.homecenter.japlace.generated.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JpParameters implements Serializable {

    private static final long serialVersionUID = -1156832533;

    private Object prmId;
    private Object prmCode;
    private Object prmDesc;
    private Object prmValue;
    private String prmType;

    public JpParameters() {}

    public JpParameters(JpParameters value) {
        this.prmId = value.prmId;
        this.prmCode = value.prmCode;
        this.prmDesc = value.prmDesc;
        this.prmValue = value.prmValue;
        this.prmType = value.prmType;
    }

    public JpParameters(
        Object prmId,
        Object prmCode,
        Object prmDesc,
        Object prmValue,
        String prmType
    ) {
        this.prmId = prmId;
        this.prmCode = prmCode;
        this.prmDesc = prmDesc;
        this.prmValue = prmValue;
        this.prmType = prmType;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPrmId() {
        return this.prmId;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPrmId(Object prmId) {
        this.prmId = prmId;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPrmCode() {
        return this.prmCode;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPrmCode(Object prmCode) {
        this.prmCode = prmCode;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPrmDesc() {
        return this.prmDesc;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPrmDesc(Object prmDesc) {
        this.prmDesc = prmDesc;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPrmValue() {
        return this.prmValue;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPrmValue(Object prmValue) {
        this.prmValue = prmValue;
    }

    public String getPrmType() {
        return this.prmType;
    }

    public void setPrmType(String prmType) {
        this.prmType = prmType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JpParameters (");

        sb.append(prmId);
        sb.append(", ").append(prmCode);
        sb.append(", ").append(prmDesc);
        sb.append(", ").append(prmValue);
        sb.append(", ").append(prmType);

        sb.append(")");
        return sb.toString();
    }
}
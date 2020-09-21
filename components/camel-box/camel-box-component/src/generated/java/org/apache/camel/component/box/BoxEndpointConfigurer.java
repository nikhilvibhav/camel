/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BoxEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BoxEndpoint target = (BoxEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "accessTokenCache": target.getConfiguration().setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "authenticationtype":
        case "authenticationType": target.getConfiguration().setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptionalgorithm":
        case "encryptionAlgorithm": target.getConfiguration().setEncryptionAlgorithm(property(camelContext, com.box.sdk.EncryptionAlgorithm.class, value)); return true;
        case "enterpriseid":
        case "enterpriseId": target.getConfiguration().setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "httpparams":
        case "httpParams": target.getConfiguration().setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxcacheentries":
        case "maxCacheEntries": target.getConfiguration().setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "privatekeyfile":
        case "privateKeyFile": target.getConfiguration().setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "privateKeyPassword": target.getConfiguration().setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "publicKeyId": target.getConfiguration().setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "userid":
        case "userId": target.getConfiguration().setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "userPassword": target.getConfiguration().setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessTokenCache", com.box.sdk.IAccessTokenCache.class);
        answer.put("authenticationType", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("clientId", java.lang.String.class);
        answer.put("clientSecret", java.lang.String.class);
        answer.put("encryptionAlgorithm", com.box.sdk.EncryptionAlgorithm.class);
        answer.put("enterpriseId", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("httpParams", java.util.Map.class);
        answer.put("inBody", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxCacheEntries", int.class);
        answer.put("privateKeyFile", java.lang.String.class);
        answer.put("privateKeyPassword", java.lang.String.class);
        answer.put("publicKeyId", java.lang.String.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("synchronous", boolean.class);
        answer.put("userId", java.lang.String.class);
        answer.put("userName", java.lang.String.class);
        answer.put("userPassword", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BoxEndpoint target = (BoxEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "accessTokenCache": return target.getConfiguration().getAccessTokenCache();
        case "authenticationtype":
        case "authenticationType": return target.getConfiguration().getAuthenticationType();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clientid":
        case "clientId": return target.getConfiguration().getClientId();
        case "clientsecret":
        case "clientSecret": return target.getConfiguration().getClientSecret();
        case "encryptionalgorithm":
        case "encryptionAlgorithm": return target.getConfiguration().getEncryptionAlgorithm();
        case "enterpriseid":
        case "enterpriseId": return target.getConfiguration().getEnterpriseId();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "httpparams":
        case "httpParams": return target.getConfiguration().getHttpParams();
        case "inbody":
        case "inBody": return target.getInBody();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxcacheentries":
        case "maxCacheEntries": return target.getConfiguration().getMaxCacheEntries();
        case "privatekeyfile":
        case "privateKeyFile": return target.getConfiguration().getPrivateKeyFile();
        case "privatekeypassword":
        case "privateKeyPassword": return target.getConfiguration().getPrivateKeyPassword();
        case "publickeyid":
        case "publicKeyId": return target.getConfiguration().getPublicKeyId();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "userid":
        case "userId": return target.getConfiguration().getUserId();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        case "userpassword":
        case "userPassword": return target.getConfiguration().getUserPassword();
        default: return null;
        }
    }
}

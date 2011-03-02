/*
 * Author: Konstantin Krivopustov
 * Created: 22.11.2009 18:05:54
 * 
 * $Id$
 */
package com.haulmont.cuba.core.global;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.DefaultInt;
import com.haulmont.cuba.core.config.defaults.DefaultBoolean;
import com.haulmont.cuba.core.config.defaults.DefaultString;

@Source(type = SourceType.APP)
public interface GlobalConfig extends Config {

    @Property("cuba.webHostName")
    @DefaultString("localhost")
    String getWebHostName();

    @Property("cuba.webPort")
    @DefaultString("8080")
    String getWebPort();

    @Property("cuba.webContextName")
    @DefaultString("cuba")
    String getWebContextName();

    /**
     * Config directory. Root of all not deployable application configuration and logic.
     * Does not end with "/"
     */
    @Property("cuba.confDir")
    String getConfDir();

    /**
     * Logs directory. Place app-specific log files here.
     * Does not end with "/"
     */
    @Property("cuba.logDir")
    String getLogDir();

    /**
     * Support e-mail. All feedback mails will be sent on this address.
     */
    @Property("cuba.supportEmail")
    @DefaultString("cubasupport@haulmont.com")
    String getSupportEmail();

    /**
     * System ID. Use for identification. (Support emails)
     */
    @Property("cuba.systemId")
    @DefaultString("CUBA")
    String getSystemID();

    /**
     * Temporary files directory. Place app-specific temp files under this directory.
     * Does not end with "/"
     */
    @Property("cuba.tempDir")
    String getTempDir();

    /**
     * Data directory. Place persistent app-specific data files under this directory.
     * Does not end with "/"
     */
    @Property("cuba.dataDir")
    String getDataDir();

    /**
     * Used to support automatic testing
     */
    @Property("cuba.testMode")
    @DefaultBoolean(false)
    boolean getTestMode();

    /**
     * Used to support automatic testing. Contains a name of request parameter
     * that marks a request from an automatic testing tool, for example jMeter. 
     */
    @Property("cuba.testModeParamName")
    String getTestModeParamName();

    /**
     * Allows generating of unique suffixes for Ids in testing mode
     */
    @Property("cuba.allowIdSuffix")
    @DefaultBoolean(false)
    boolean getAllowIdSuffix();

    /**
     * Enable class and resource loading by Groovy
     */
    @Property("cuba.groovyClassLoaderEnabled")
    @DefaultBoolean(true)
    boolean isGroovyClassLoaderEnabled();

    /**
     * User session expiration timeout in seconds.
     * Not the same as HTTP session timeout, but should have the same value.
     */
    @Property("cuba.userSessionExpirationTimeoutSec")
    @DefaultInt(1800)
    int getUserSessionExpirationTimeoutSec();


    @Property("cuba.collectionDatasourceDbSortEnabled")
    @DefaultBoolean(true)
    boolean getCollectionDatasourceDbSortEnabled();
}

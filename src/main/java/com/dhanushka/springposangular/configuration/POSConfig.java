/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class POSConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{PersistenceConfig.class};
    }


    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }


    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

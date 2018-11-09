package com.hot.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


/**
 * @ClassName GenCode
 * @Description TODO
 * @Author Dravin
 * @Date 2018/11/9 下午4:17
 * @Version 1.0
 */
public class GenCode {
    public static void main(String[]args) throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //F:\ideaWorkspace\paycore_nrp_service\paycore_nrp_model\mgb.xml
        //F:\renren\paycore-nrp-service\paycore_nrp_model\mgb.xml
        File configFile = new File("F:\\renren\\paycore-nrp-service\\paycore_nrp_model\\mgb.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("flash....");
    }
}


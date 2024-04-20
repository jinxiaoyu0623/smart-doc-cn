package com.power.doc;

import com.power.common.util.DateTimeUtil;
import com.power.doc.builder.HtmlApiDocBuilder;
import com.power.doc.model.*;
import com.power.doc.utils.ApiParamTreeUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;

/**
 * Description:
 * ApiDoc测试
 *
 * @author yu 2018/06/11.
 */
public class ApiDocTest {

    /**
     * 包括设置请求头，缺失注释的字段批量在文档生成期使用定义好的注释
     */
    @Test
    public void testBuilderControllersApi() {

        ApiConfig config = new ApiConfig();
        config.setServerUrl("http://192.168.10.87:8001/iot");
        config.setProjectCName("物联网设备平台");
        //config.setStrict(true);
        //config.setOpenUrl("http://localhost:7700/api");
        //config.setAppToken("be4211613a734b45888c075741680e49");
        //config.setAppToken("7b0935531d1144e58a86d7b4f2ad23c6");

        //config.setDebugEnvName("测试环境");
        config.setStyle("xt256");
        //config.setCreateDebugPage(true);
//        config.setAuthor("test");
        //config.setDebugEnvUrl("http://127.0.0.1");
        //config.setTornaDebug(true);

        config.setCreateDebugPage(false);
        config.setAllInOne(true);
        config.setShowAuthor(false);
        config.setOutPath("/Users/jinxiaoyu/zkzngz-project/iot-qrcode/iot-qrcode");
        config.setMd5EncryptedHtmlName(true);
        config.setPackageFilters("com.zkzngz.iotqrcode.controller");
        //不指定SourcePaths默认加载代码为项目src/main/java下的
        config.setSourceCodePaths(
                SourceCodePath.builder().setDesc("本项目代码")
                        .setPath("/Users/jinxiaoyu/zkzngz-project/iot-qrcode"),

                //SourcePath.path().setPath("F:\\Personal\\project\\smart\\src\\main\\java")
                SourceCodePath.builder().setDesc("加载项目外代码").setPath("E:\\ApplicationPower\\ApplicationPower\\Common-util\\src\\main\\java")
        );
//        config.setPackageFilters("com.power.doc.dubbo.*");
        //config.setPackageFilters("com.power.doc.controller.UserController");

        //加载字典
//        config.setDataDictionaries(
//                ApiDataDictionary.builder().setTitle("订单字典").setEnumClass(OrderEnum.class).setCodeField("code").setDescField("desc")
//        );

        config.setIgnoreRequestParams(Collections.singletonList("org.springframework.ui.ModelMap"));
        //设置请求头，如果没有请求头，可以不用设置
        ApiParam header = new ApiParam();
        header.setField("Authorization");
//       config.setRequestHeaders(
//                ApiReqHeader.header().setName("access_token").setType("string").setDesc("Basic auth credentials"),
//                ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
//        );
        //对于外部jar的类，api-doc目前无法自动获取注释，
        //如果有这种场景，则自己添加字段和注释，api-doc后期遇到同名字段则直接给相应字段加注释
//        config.setCustomResponseFields(
//                CustomField.builder().setName("records").setDesc("分页数据").setIgnore(false).setValue(Collections.emptyList()),
//                CustomField.builder().setName("total").setDesc("记录数").setIgnore(false).setValue(20)
//                .setDesc("响应代码")
//        );

//        config.setCustomRequestFields(
//                CustomField.builder()
//                        .setName("age").setDesc("年龄").setIgnore(false).setValue("13").setRequire(false).setOwnerClassName("com.power.doc.entity.SimpleUser"),
//                CustomField.builder()
//                        .setName("sex").setDesc("性别").setIgnore(false).setValue("男").setRequire(true).setOwnerClassName("com.power.doc.entity.SimpleUser")
//
//
//        );
        //非必须只有当setAllInOne设置为true时文档变更记录才生效，https://gitee.com/sunyurepository/ApplicationPower/issues/IPS4O
        config.setRevisionLogs(
                RevisionLog.builder().setRevisionTime("2022/03/15").setAuthor("jinxiaoyu").setRemarks("").setStatus("创建").setVersion("V1.0"),
                RevisionLog.builder().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("").setStatus("修改").setVersion("V2.0")
        );
//        config.setResponseBodyAdvice(BodyAdvice.builder()
//                .setDataField("data")
//                .setDataField("dadada")
//                .setClassName("com.power.common.model.CommonResult"));

//        config.setRequestBodyAdvice(BodyAdvice.builder()
//                .setDataField("data")
//                .setDataField("dadada")
//                .setClassName("com.power.common.model.CommonResult"));
//        config.setRpcApiDependencies(RpcApiDependency.builder().setGroupId("com.test").setArtifactId("test1").setVersion("1.0"),
//                RpcApiDependency.builder().setGroupId("com.smart").setArtifactId("test").setVersion("1.1.1")
//        );
        long start = System.currentTimeMillis();

        //TornaBuilder.buildApiDoc(config);
        //OpenApiBuilder.buildOpenApi(config);
        HtmlApiDocBuilder.buildApiDoc(config);
       // RpcTornaBuilder.buildApiDoc(config);
        //TornaBuilder.buildApiDoc(config);
        //RpcTornaBuilder.buildApiDoc(config);
//        TornaBuilder.buildApiDoc(config);
        // RpcHtmlBuilder.buildApiDoc(config);
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);
    }

}

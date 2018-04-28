package com.github.isdream.aliyunecs;

import com.aliyuncs.ecs.model.v20140526.CreateNatGatewayRequest;
import com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressRequest;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.regions.ProductDomain;
import com.github.isdream.jointware.core.helpers.ParametersHelper;
import junit.framework.TestCase;

import javax.net.ssl.SSLSocketFactory;

public class AliyunECSModelParameterAnalyzerTest extends TestCase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        AliyunECSModelParameterAnalyzer analyzer = new AliyunECSModelParameterAnalyzer();
        //showModelParametersWithKeyValueStyle(analyzer);
        showModelParametersWithNetstedStyle(analyzer);
        //showModelParametersWithJsonStyle(analyzer);
        CreateNatGatewayRequest createNatGatewayRequest =new CreateNatGatewayRequest();
    }

    protected static void showModelParametersWithJsonStyle(AliyunECSModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithJsonStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithNetstedStyle(AliyunECSModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithNetstedStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }

    protected static void showModelParametersWithKeyValueStyle(AliyunECSModelParameterAnalyzer analyzer) {
        for (String kind : analyzer.getKindModels().keySet()) {
            ParametersHelper.showModelParametersWithKeyValueStyle("AliyunECS", kind, analyzer.getModelParameters(kind));
        }
    }
}

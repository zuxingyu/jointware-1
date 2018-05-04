/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.helpers.ModelsHelper;
import com.github.isdream.tencent.cvm.TencentCVMKindAnalyzer;
import com.github.isdream.tencent.cvm.TencentCVMKindModelAnalyzer;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Collection;
import java.util.Map;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年5月4日
 */
@SuppressWarnings("deprecation")
public class TencentCVMKindModelAnalyzerTest extends TestCase {
    Map<String, String> kindModels = null;

    @Override
    protected void setUp() throws Exception {
        kindModels = new TencentCVMKindModelAnalyzer().getKindModels();
    }

    public void testEuqalFeatures() {
        Assert.assertEquals(ModelsHelper.testGreatAndEuqalFeatures(
                new TencentCVMKindAnalyzer().getKinds(),
                kindModels.keySet()), true);
    }

    public void testModelsWithTrueResults() {
    	Collection<String> models = kindModels.values();
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.UpdateInstanceVpcConfigRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RenewHostsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RenewInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.StopInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyKeyPairAttributeRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DisassociateInstancesKeyPairsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.TerminateInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DeleteImagesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeHostsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.SyncImagesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceOperationLogsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstancesPasswordRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImagesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ImportImageRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceTypeConfigsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResetInstanceRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceInternetBandwidthConfigsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RebootInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.AssociateInstancesKeyPairsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstancesInternetMaxBandwidthRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeKeyPairsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceFamilyConfigsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceRunInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResetInstancesTypeRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.StartInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyInstancesAttributeRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesStatusRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.AllocateHostsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResetInstancesInternetMaxBandwidthRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyImageSharePermissionRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyInstancesRenewFlagRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DeleteKeyPairsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImageSharePermissionRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ImportKeyPairRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstanceRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.QueryMigrateTaskRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImageQuotaRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeRegionsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.CreateImageRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInternetChargeTypeConfigsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResizeInstanceDisksRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyImageAttributeRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyHostsAttributeRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyInstancesProjectRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstancesTypeRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceRenewInstancesRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImportImageOsRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.CreateKeyPairRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResizeInstanceDisksRequest"), true);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RunInstancesRequest"), true);
    }

    public void testModelsWithFalseResults() {
    	Collection<String> models = kindModels.values();
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.UpdateInstanceVpcConfigRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RenewHostsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RenewInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.StopInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyKeyPairAttributeRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DisassociateInstancesKeyPairsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.TerminateInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DeleteImagesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeHostsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.SyncImagesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceOperationLogsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstancesPasswordRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImagesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ImportImageRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceTypeConfigsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResetInstanceRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceInternetBandwidthConfigsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RebootInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.AssociateInstancesKeyPairsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstancesInternetMaxBandwidthRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeKeyPairsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstanceFamilyConfigsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceRunInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResetInstancesTypeRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.StartInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyInstancesAttributeRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesStatusRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.AllocateHostsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResetInstancesInternetMaxBandwidthRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyImageSharePermissionRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyInstancesRenewFlagRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DeleteKeyPairsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImageSharePermissionRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ImportKeyPairRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstanceRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.QueryMigrateTaskRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImageQuotaRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeRegionsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.CreateImageRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeInternetChargeTypeConfigsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResizeInstanceDisksRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyImageAttributeRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyHostsAttributeRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ModifyInstancesProjectRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.ResetInstancesTypeRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceRenewInstancesRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.DescribeImportImageOsRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.CreateKeyPairRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.InquiryPriceResizeInstanceDisksRequestFalse"), false);
    	Assert.assertEquals(models.contains("com.tencentcloudapi.cvm.v20170312.models.RunInstancesRequestFalse"), false);
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        TencentCVMKindModelAnalyzer kkma = new TencentCVMKindModelAnalyzer();
        ModelsHelper.showAllModels("TencentCVM", kkma.getKindModels());
        ModelsHelper.testModelsWithTrueResults(kkma.getKindModels().values());
        ModelsHelper.testModelsWithFalseResults(kkma.getKindModels().values());
    }

}

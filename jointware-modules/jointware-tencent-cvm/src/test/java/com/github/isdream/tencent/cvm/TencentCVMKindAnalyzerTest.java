/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.tencent.cvm;

import com.github.isdream.jointware.core.helpers.FeaturesHelper;
import com.github.isdream.tencent.cvm.TencentCVMKindAnalyzer;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.Set;

import org.junit.Assert;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
@SuppressWarnings("deprecation")
public class TencentCVMKindAnalyzerTest extends TestCase {

    Set<String> kinds = null;

    @Override
    protected void setUp() throws Exception {
        kinds = new TencentCVMKindAnalyzer().getKinds();
    }

    public void testFeaturesWithTrueResults() {
    	Assert.assertEquals(kinds.contains("UpdateInstanceVpcConfig"), true);
    	Assert.assertEquals(kinds.contains("RenewHosts"), true);
    	Assert.assertEquals(kinds.contains("RenewInstances"), true);
    	Assert.assertEquals(kinds.contains("StopInstances"), true);
    	Assert.assertEquals(kinds.contains("ModifyKeyPairAttribute"), true);
    	Assert.assertEquals(kinds.contains("DescribeZones"), true);
    	Assert.assertEquals(kinds.contains("DisassociateInstancesKeyPairs"), true);
    	Assert.assertEquals(kinds.contains("TerminateInstances"), true);
    	Assert.assertEquals(kinds.contains("DeleteImages"), true);
    	Assert.assertEquals(kinds.contains("DescribeInstanceOperationLogs"), true);
    	Assert.assertEquals(kinds.contains("DescribeHosts"), true);
    	Assert.assertEquals(kinds.contains("SyncImages"), true);
    	Assert.assertEquals(kinds.contains("ResetInstancesPassword"), true);
    	Assert.assertEquals(kinds.contains("DescribeImages"), true);
    	Assert.assertEquals(kinds.contains("ImportImage"), true);
    	Assert.assertEquals(kinds.contains("DescribeInstanceTypeConfigs"), true);
    	Assert.assertEquals(kinds.contains("InquiryPriceResetInstance"), true);
    	Assert.assertEquals(kinds.contains("DescribeInstanceInternetBandwidthConfigs"), true);
    	Assert.assertEquals(kinds.contains("RebootInstances"), true);
    	Assert.assertEquals(kinds.contains("AssociateInstancesKeyPairs"), true);
    	Assert.assertEquals(kinds.contains("ResetInstancesInternetMaxBandwidth"), true);
    	Assert.assertEquals(kinds.contains("DescribeInstances"), true);
    	Assert.assertEquals(kinds.contains("DescribeKeyPairs"), true);
    	Assert.assertEquals(kinds.contains("DescribeInstanceFamilyConfigs"), true);
    	Assert.assertEquals(kinds.contains("InquiryPriceRunInstances"), true);
    	Assert.assertEquals(kinds.contains("InquiryPriceResetInstancesType"), true);
    	Assert.assertEquals(kinds.contains("StartInstances"), true);
    	Assert.assertEquals(kinds.contains("ModifyInstancesAttribute"), true);
    	Assert.assertEquals(kinds.contains("DescribeInstancesStatus"), true);
    	Assert.assertEquals(kinds.contains("AllocateHosts"), true);
    	Assert.assertEquals(kinds.contains("InquiryPriceResetInstancesInternetMaxBandwidth"), true);
    	Assert.assertEquals(kinds.contains("ModifyImageSharePermission"), true);
    	Assert.assertEquals(kinds.contains("ModifyInstancesRenewFlag"), true);
    	Assert.assertEquals(kinds.contains("DeleteKeyPairs"), true);
    	Assert.assertEquals(kinds.contains("DescribeImageSharePermission"), true);
    	Assert.assertEquals(kinds.contains("ImportKeyPair"), true);
    	Assert.assertEquals(kinds.contains("ResetInstance"), true);
    	Assert.assertEquals(kinds.contains("QueryMigrateTask"), true);
    	Assert.assertEquals(kinds.contains("DescribeImageQuota"), true);
    	Assert.assertEquals(kinds.contains("DescribeRegions"), true);
    	Assert.assertEquals(kinds.contains("CreateImage"), true);
    	Assert.assertEquals(kinds.contains("DescribeInternetChargeTypeConfigs"), true);
    	Assert.assertEquals(kinds.contains("ResizeInstanceDisks"), true);
    	Assert.assertEquals(kinds.contains("ModifyImageAttribute"), true);
    	Assert.assertEquals(kinds.contains("ModifyHostsAttribute"), true);
    	Assert.assertEquals(kinds.contains("ModifyInstancesProject"), true);
    	Assert.assertEquals(kinds.contains("ResetInstancesType"), true);
    	Assert.assertEquals(kinds.contains("InquiryPriceRenewInstances"), true);
    	Assert.assertEquals(kinds.contains("DescribeImportImageOs"), true);
    	Assert.assertEquals(kinds.contains("CreateKeyPair"), true);
    	Assert.assertEquals(kinds.contains("InquiryPriceResizeInstanceDisks"), true);
    	Assert.assertEquals(kinds.contains("RunInstances"), true);
    }

    public void testFeaturesWithFalseResults() {
    	Assert.assertEquals(kinds.contains("UpdateInstanceVpcConfigFalse"), false);
    	Assert.assertEquals(kinds.contains("RenewHostsFalse"), false);
    	Assert.assertEquals(kinds.contains("RenewInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("StopInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyKeyPairAttributeFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeZonesFalse"), false);
    	Assert.assertEquals(kinds.contains("DisassociateInstancesKeyPairsFalse"), false);
    	Assert.assertEquals(kinds.contains("TerminateInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("DeleteImagesFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInstanceOperationLogsFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeHostsFalse"), false);
    	Assert.assertEquals(kinds.contains("SyncImagesFalse"), false);
    	Assert.assertEquals(kinds.contains("ResetInstancesPasswordFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeImagesFalse"), false);
    	Assert.assertEquals(kinds.contains("ImportImageFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInstanceTypeConfigsFalse"), false);
    	Assert.assertEquals(kinds.contains("InquiryPriceResetInstanceFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInstanceInternetBandwidthConfigsFalse"), false);
    	Assert.assertEquals(kinds.contains("RebootInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("AssociateInstancesKeyPairsFalse"), false);
    	Assert.assertEquals(kinds.contains("ResetInstancesInternetMaxBandwidthFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeKeyPairsFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInstanceFamilyConfigsFalse"), false);
    	Assert.assertEquals(kinds.contains("InquiryPriceRunInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("InquiryPriceResetInstancesTypeFalse"), false);
    	Assert.assertEquals(kinds.contains("StartInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyInstancesAttributeFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInstancesStatusFalse"), false);
    	Assert.assertEquals(kinds.contains("AllocateHostsFalse"), false);
    	Assert.assertEquals(kinds.contains("InquiryPriceResetInstancesInternetMaxBandwidthFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyImageSharePermissionFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyInstancesRenewFlagFalse"), false);
    	Assert.assertEquals(kinds.contains("DeleteKeyPairsFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeImageSharePermissionFalse"), false);
    	Assert.assertEquals(kinds.contains("ImportKeyPairFalse"), false);
    	Assert.assertEquals(kinds.contains("ResetInstanceFalse"), false);
    	Assert.assertEquals(kinds.contains("QueryMigrateTaskFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeImageQuotaFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeRegionsFalse"), false);
    	Assert.assertEquals(kinds.contains("CreateImageFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeInternetChargeTypeConfigsFalse"), false);
    	Assert.assertEquals(kinds.contains("ResizeInstanceDisksFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyImageAttributeFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyHostsAttributeFalse"), false);
    	Assert.assertEquals(kinds.contains("ModifyInstancesProjectFalse"), false);
    	Assert.assertEquals(kinds.contains("ResetInstancesTypeFalse"), false);
    	Assert.assertEquals(kinds.contains("InquiryPriceRenewInstancesFalse"), false);
    	Assert.assertEquals(kinds.contains("DescribeImportImageOsFalse"), false);
    	Assert.assertEquals(kinds.contains("CreateKeyPairFalse"), false);
    	Assert.assertEquals(kinds.contains("InquiryPriceResizeInstanceDisksFalse"), false);
    	Assert.assertEquals(kinds.contains("RunInstancesFalse"), false);
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        TencentCVMKindAnalyzer kka = new TencentCVMKindAnalyzer();
        FeaturesHelper.showAllFeatures("TencentCVM", kka.getKinds());
        FeaturesHelper.testFeaturesWithTrueResults(kka.getKinds());
        FeaturesHelper.testFeaturesWithFalseResults(kka.getKinds());

    }
}

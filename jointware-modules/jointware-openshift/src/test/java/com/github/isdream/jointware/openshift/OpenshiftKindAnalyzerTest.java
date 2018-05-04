/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift;

import java.util.Set;

import org.junit.Assert;

import com.github.isdream.jointware.core.helpers.FeaturesHelper;
import com.github.isdream.jointware.kubernetes.OpenshiftKindAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
@SuppressWarnings("deprecation")
public class OpenshiftKindAnalyzerTest extends TestCase {

	Set<String> kinds = null;
	
	@Override
	protected void setUp() throws Exception {
		kinds = new OpenshiftKindAnalyzer().getKinds();
	}

	public void testFeaturesWithTrueResults() {
		Assert.assertEquals(kinds.contains("ServiceAccount"), true);
		Assert.assertEquals(kinds.contains("ThirdPartyResource"), true);
		Assert.assertEquals(kinds.contains("Node"), true);
		Assert.assertEquals(kinds.contains("Deployment"), true);
		Assert.assertEquals(kinds.contains("Endpoint"), true);
		Assert.assertEquals(kinds.contains("ResourceQuota"), true);
		Assert.assertEquals(kinds.contains("ReplicationController"), true);
		Assert.assertEquals(kinds.contains("Job"), true);
		Assert.assertEquals(kinds.contains("ReplicaSet"), true);
		Assert.assertEquals(kinds.contains("Pod"), true);
		Assert.assertEquals(kinds.contains("ConfigMap"), true);
		Assert.assertEquals(kinds.contains("NetworkPolicy"), true);
		Assert.assertEquals(kinds.contains("CustomResourceDefinition"), true);
		Assert.assertEquals(kinds.contains("Ingress"), true);
		Assert.assertEquals(kinds.contains("Service"), true);
		Assert.assertEquals(kinds.contains("SecurityContextConstraint"), true);
		Assert.assertEquals(kinds.contains("Namespace"), true);
		Assert.assertEquals(kinds.contains("Secret"), true);
		Assert.assertEquals(kinds.contains("LimitRange"), true);
		Assert.assertEquals(kinds.contains("HorizontalPodAutoscaler"), true);
		Assert.assertEquals(kinds.contains("Event"), true);
		Assert.assertEquals(kinds.contains("DaemonSet"), true);
		Assert.assertEquals(kinds.contains("PersistentVolumeClaim"), true);
		Assert.assertEquals(kinds.contains("PersistentVolume"), true);
		Assert.assertEquals(kinds.contains("StatefulSet"), true);
		Assert.assertEquals(kinds.contains("Componentstatus"), true);
	}
	
	public void testFeaturesWithFalseResults() {
		Assert.assertEquals(kinds.contains("ServiceAccountFalse"), false);
		Assert.assertEquals(kinds.contains("ThirdPartyResourceFalse"), false);
		Assert.assertEquals(kinds.contains("NodeFalse"), false);
		Assert.assertEquals(kinds.contains("DeploymentFalse"), false);
		Assert.assertEquals(kinds.contains("EndpointFalse"), false);
		Assert.assertEquals(kinds.contains("ResourceQuotaFalse"), false);
		Assert.assertEquals(kinds.contains("ReplicationControllerFalse"), false);
		Assert.assertEquals(kinds.contains("JobFalse"), false);
		Assert.assertEquals(kinds.contains("ReplicaSetFalse"), false);
		Assert.assertEquals(kinds.contains("PodFalse"), false);
		Assert.assertEquals(kinds.contains("ConfigMapFalse"), false);
		Assert.assertEquals(kinds.contains("NetworkPolicyFalse"), false);
		Assert.assertEquals(kinds.contains("CustomResourceDefinitionFalse"), false);
		Assert.assertEquals(kinds.contains("IngressFalse"), false);
		Assert.assertEquals(kinds.contains("ServiceFalse"), false);
		Assert.assertEquals(kinds.contains("SecurityContextConstraintFalse"), false);
		Assert.assertEquals(kinds.contains("NamespaceFalse"), false);
		Assert.assertEquals(kinds.contains("SecretFalse"), false);
		Assert.assertEquals(kinds.contains("LimitRangeFalse"), false);
		Assert.assertEquals(kinds.contains("HorizontalPodAutoscalerFalse"), false);
		Assert.assertEquals(kinds.contains("EventFalse"), false);
		Assert.assertEquals(kinds.contains("DaemonSetFalse"), false);
		Assert.assertEquals(kinds.contains("PersistentVolumeClaimFalse"), false);
		Assert.assertEquals(kinds.contains("PersistentVolumeFalse"), false);
		Assert.assertEquals(kinds.contains("ComponentstatusFalse"), false);
		Assert.assertEquals(kinds.contains("StatefulSetFalse"), false);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OpenshiftKindAnalyzer kka = new OpenshiftKindAnalyzer();
		FeaturesHelper.showAllFeatures("Openshift", kka.getKinds());
		FeaturesHelper.testFeaturesWithTrueResults(kka.getKinds());
		FeaturesHelper.testFeaturesWithFalseResults(kka.getKinds());
	}
}

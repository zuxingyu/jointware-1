/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import java.util.Collection;
import java.util.Map;

import org.junit.Assert;

import com.github.isdream.jointware.core.helpers.ModelsHelper;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
@SuppressWarnings("deprecation")
public class KubernetesKindModelsAnalyzerTest extends TestCase {

	Map<String, String> kindModels = null;
	
	@Override
	protected void setUp() throws Exception {
		kindModels = new KubernetesKindModelAnalyzer().getKindModels();
	}

	public void testEuqalFeatures() {
		Assert.assertEquals(ModelsHelper.testGreatAndEuqalFeatures(
						new KubernetesKindAnalyzer().getKinds(), 
						kindModels.keySet()), true);
	}
	
	public void testModelsWithTrueResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ServiceAccount"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Pod"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ConfigMap"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.NetworkPolicy"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Node"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Service"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.Deployment"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.Ingress"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Namespace"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Secret"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.LimitRange"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ResourceQuota"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ReplicationController"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Event"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolumeClaim"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.DaemonSet"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolume"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Job"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.StatefulSet"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ReplicaSet"), true);
	}
	
	public void testModelsWithFalseResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ServiceAccountFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PodFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ConfigMapFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ThirdPartyResourceFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.NetworkPolicyFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.NodeFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ServiceFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.DeploymentFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.IngressFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.NamespaceFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.SecretFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.LimitRangeFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ResourceQuotaFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ReplicationControllerFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.EventFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolumeClaimFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.DaemonSetFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolumeFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.JobFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.StatefulSetFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ReplicaSetFalse"), false);

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KubernetesKindModelAnalyzer kkma = new KubernetesKindModelAnalyzer();
		ModelsHelper.showAllModels("Kubernetes", kkma.getKindModels());
		ModelsHelper.testModelsWithTrueResults(kkma.getKindModels().values());
		ModelsHelper.testModelsWithFalseResults(kkma.getKindModels().values());
	}

}

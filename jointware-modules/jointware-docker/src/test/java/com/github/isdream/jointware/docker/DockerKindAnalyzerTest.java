/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import java.util.Set;

import org.junit.Assert;

import com.github.isdream.jointware.core.helpers.FeaturesHelper;
import com.github.isdream.jointware.docker.DockerKindAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
@SuppressWarnings("deprecation")
public class DockerKindAnalyzerTest extends TestCase {

	Set<String> kinds = null;
	
	@Override
	protected void setUp() throws Exception {
		kinds = new DockerKindAnalyzer().getKinds();
	}

	public void testFeaturesWithTrueResults() {
		Assert.assertEquals(kinds.contains("AttachContainer"), true);
		Assert.assertEquals(kinds.contains("ExecCreate"), true);
		Assert.assertEquals(kinds.contains("PauseContainer"), true);
		Assert.assertEquals(kinds.contains("PullImage"), true);
		Assert.assertEquals(kinds.contains("KillContainer"), true);
		Assert.assertEquals(kinds.contains("SaveImage"), true);
		Assert.assertEquals(kinds.contains("ListSwarmNodes"), true);
		Assert.assertEquals(kinds.contains("ListContainers"), true);
		Assert.assertEquals(kinds.contains("InspectSwarm"), true);
		Assert.assertEquals(kinds.contains("Version"), true);
		Assert.assertEquals(kinds.contains("CreateNetwork"), true);
		Assert.assertEquals(kinds.contains("JoinSwarm"), true);
		Assert.assertEquals(kinds.contains("UnpauseContainer"), true);
		Assert.assertEquals(kinds.contains("CopyFileFromContainer"), true);
		Assert.assertEquals(kinds.contains("TagImage"), true);
		Assert.assertEquals(kinds.contains("UpdateSwarm"), true);
		Assert.assertEquals(kinds.contains("SearchImages"), true);
		Assert.assertEquals(kinds.contains("RemoveVolume"), true);
		Assert.assertEquals(kinds.contains("InspectImage"), true);
		Assert.assertEquals(kinds.contains("BuildImage"), true);
		Assert.assertEquals(kinds.contains("ListServices"), true);
		Assert.assertEquals(kinds.contains("RemoveImage"), true);
		Assert.assertEquals(kinds.contains("ListTasks"), true);
		Assert.assertEquals(kinds.contains("InspectVolume"), true);
		Assert.assertEquals(kinds.contains("RemoveNetwork"), true);
		Assert.assertEquals(kinds.contains("PushImage"), true);
		Assert.assertEquals(kinds.contains("WaitContainer"), true);
		Assert.assertEquals(kinds.contains("CreateService"), true);
		Assert.assertEquals(kinds.contains("UpdateService"), true);
		Assert.assertEquals(kinds.contains("CopyArchiveToContainer"), true);
		Assert.assertEquals(kinds.contains("Ping"), true);
		Assert.assertEquals(kinds.contains("Stats"), true);
		Assert.assertEquals(kinds.contains("ExecStart"), true);
		Assert.assertEquals(kinds.contains("LeaveSwarm"), true);
		Assert.assertEquals(kinds.contains("TopContainer"), true);
		Assert.assertEquals(kinds.contains("StopContainer"), true);
		Assert.assertEquals(kinds.contains("RemoveContainer"), true);
		Assert.assertEquals(kinds.contains("ListNetworks"), true);
		Assert.assertEquals(kinds.contains("ListImages"), true);
		Assert.assertEquals(kinds.contains("ListVolumes"), true);
		Assert.assertEquals(kinds.contains("ContainerDiff"), true);
		Assert.assertEquals(kinds.contains("RemoveService"), true);
		Assert.assertEquals(kinds.contains("Events"), true);
		Assert.assertEquals(kinds.contains("Auth"), true);
		Assert.assertEquals(kinds.contains("CreateImage"), true);
		Assert.assertEquals(kinds.contains("LogContainer"), true);
		Assert.assertEquals(kinds.contains("ConnectToNetwork"), true);
		Assert.assertEquals(kinds.contains("InspectNetwork"), true);
		Assert.assertEquals(kinds.contains("DisconnectFromNetwork"), true);
		Assert.assertEquals(kinds.contains("Info"), true);
		Assert.assertEquals(kinds.contains("CopyArchiveFromContainer"), true);
		Assert.assertEquals(kinds.contains("UpdateSwarmNode"), true);
		Assert.assertEquals(kinds.contains("RenameContainer"), true);
		Assert.assertEquals(kinds.contains("Commit"), true);
		Assert.assertEquals(kinds.contains("InspectExec"), true);
		Assert.assertEquals(kinds.contains("StartContainer"), true);
		Assert.assertEquals(kinds.contains("UpdateContainer"), true);
		Assert.assertEquals(kinds.contains("InitializeSwarm"), true);
		Assert.assertEquals(kinds.contains("LoadImage"), true);
		Assert.assertEquals(kinds.contains("CreateContainer"), true);
		Assert.assertEquals(kinds.contains("InspectContainer"), true);
		Assert.assertEquals(kinds.contains("InspectService"), true);
		Assert.assertEquals(kinds.contains("CreateVolume"), true);
		Assert.assertEquals(kinds.contains("RestartContainer"), true);
	}
	
	public void testFeaturesWithFalseResults() {
		Assert.assertEquals(kinds.contains("AttachContainerFalse"), false);
		Assert.assertEquals(kinds.contains("ExecCreateFalse"), false);
		Assert.assertEquals(kinds.contains("PauseContainerFalse"), false);
		Assert.assertEquals(kinds.contains("PullImageFalse"), false);
		Assert.assertEquals(kinds.contains("KillContainerFalse"), false);
		Assert.assertEquals(kinds.contains("SaveImageFalse"), false);
		Assert.assertEquals(kinds.contains("ListSwarmNodesFalse"), false);
		Assert.assertEquals(kinds.contains("ListContainersFalse"), false);
		Assert.assertEquals(kinds.contains("InspectSwarmFalse"), false);
		Assert.assertEquals(kinds.contains("VersionFalse"), false);
		Assert.assertEquals(kinds.contains("CreateNetworkFalse"), false);
		Assert.assertEquals(kinds.contains("JoinSwarmFalse"), false);
		Assert.assertEquals(kinds.contains("UnpauseContainerFalse"), false);
		Assert.assertEquals(kinds.contains("CopyFileFromContainerFalse"), false);
		Assert.assertEquals(kinds.contains("TagImageFalse"), false);
		Assert.assertEquals(kinds.contains("UpdateSwarmFalse"), false);
		Assert.assertEquals(kinds.contains("SearchImagesFalse"), false);
		Assert.assertEquals(kinds.contains("RemoveVolumeFalse"), false);
		Assert.assertEquals(kinds.contains("InspectImageFalse"), false);
		Assert.assertEquals(kinds.contains("BuildImageFalse"), false);
		Assert.assertEquals(kinds.contains("ListServicesFalse"), false);
		Assert.assertEquals(kinds.contains("RemoveImageFalse"), false);
		Assert.assertEquals(kinds.contains("ListTasksFalse"), false);
		Assert.assertEquals(kinds.contains("InspectVolumeFalse"), false);
		Assert.assertEquals(kinds.contains("RemoveNetworkFalse"), false);
		Assert.assertEquals(kinds.contains("PushImageFalse"), false);
		Assert.assertEquals(kinds.contains("WaitContainerFalse"), false);
		Assert.assertEquals(kinds.contains("CreateServiceFalse"), false);
		Assert.assertEquals(kinds.contains("UpdateServiceFalse"), false);
		Assert.assertEquals(kinds.contains("CopyArchiveToContainerFalse"), false);
		Assert.assertEquals(kinds.contains("PingFalse"), false);
		Assert.assertEquals(kinds.contains("StatsFalse"), false);
		Assert.assertEquals(kinds.contains("ExecStartFalse"), false);
		Assert.assertEquals(kinds.contains("LeaveSwarmFalse"), false);
		Assert.assertEquals(kinds.contains("TopContainerFalse"), false);
		Assert.assertEquals(kinds.contains("StopContainerFalse"), false);
		Assert.assertEquals(kinds.contains("RemoveContainerFalse"), false);
		Assert.assertEquals(kinds.contains("ListNetworksFalse"), false);
		Assert.assertEquals(kinds.contains("ListImagesFalse"), false);
		Assert.assertEquals(kinds.contains("ListVolumesFalse"), false);
		Assert.assertEquals(kinds.contains("ContainerDiffFalse"), false);
		Assert.assertEquals(kinds.contains("RemoveServiceFalse"), false);
		Assert.assertEquals(kinds.contains("EventsFalse"), false);
		Assert.assertEquals(kinds.contains("AuthFalse"), false);
		Assert.assertEquals(kinds.contains("CreateImageFalse"), false);
		Assert.assertEquals(kinds.contains("LogContainerFalse"), false);
		Assert.assertEquals(kinds.contains("ConnectToNetworkFalse"), false);
		Assert.assertEquals(kinds.contains("InspectNetworkFalse"), false);
		Assert.assertEquals(kinds.contains("DisconnectFromNetworkFalse"), false);
		Assert.assertEquals(kinds.contains("InfoFalse"), false);
		Assert.assertEquals(kinds.contains("CopyArchiveFromContainerFalse"), false);
		Assert.assertEquals(kinds.contains("UpdateSwarmNodeFalse"), false);
		Assert.assertEquals(kinds.contains("RenameContainerFalse"), false);
		Assert.assertEquals(kinds.contains("CommitFalse"), false);
		Assert.assertEquals(kinds.contains("InspectExecFalse"), false);
		Assert.assertEquals(kinds.contains("StartContainerFalse"), false);
		Assert.assertEquals(kinds.contains("UpdateContainerFalse"), false);
		Assert.assertEquals(kinds.contains("InitializeSwarmFalse"), false);
		Assert.assertEquals(kinds.contains("LoadImageFalse"), false);
		Assert.assertEquals(kinds.contains("CreateContainerFalse"), false);
		Assert.assertEquals(kinds.contains("InspectContainerFalse"), false);
		Assert.assertEquals(kinds.contains("InspectServiceFalse"), false);
		Assert.assertEquals(kinds.contains("CreateVolumeFalse"), false);
		Assert.assertEquals(kinds.contains("RestartContainerFalse"), false);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DockerKindAnalyzer kka = new DockerKindAnalyzer();
		FeaturesHelper.showAllFeatures("Docker", kka.getKinds());
		FeaturesHelper.testFeaturesWithTrueResults(kka.getKinds());
		FeaturesHelper.testFeaturesWithFalseResults(kka.getKinds());
	}
}

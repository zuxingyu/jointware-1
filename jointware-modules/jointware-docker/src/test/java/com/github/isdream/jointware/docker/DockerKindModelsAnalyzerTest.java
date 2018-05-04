/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker;

import java.util.Collection;
import java.util.Map;

import org.junit.Assert;

import com.github.isdream.jointware.core.helpers.ModelsHelper;
import com.github.isdream.jointware.docker.DockerKindAnalyzer;
import com.github.isdream.jointware.docker.DockerKindModelAnalyzer;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
@SuppressWarnings("deprecation")
public class DockerKindModelsAnalyzerTest extends TestCase {

	Map<String, String> kindModels = null;
	
	@Override
	protected void setUp() throws Exception {
		kindModels = new DockerKindModelAnalyzer().getKindModels();
	}

	public void testEuqalFeatures() {
		Assert.assertEquals(ModelsHelper.testGreatAndEuqalFeatures(
						new DockerKindAnalyzer().getKinds(), 
						kindModels.keySet()), true);
	}
	
	public void testModelsWithTrueResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.AttachContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ExecCreateCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PauseContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PullImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.KillContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.SaveImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListContainersCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListSwarmNodesCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectSwarmCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.VersionCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateNetworkCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UnpauseContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.JoinSwarmCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CopyFileFromContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.TagImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.SearchImagesCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveVolumeCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateSwarmCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.BuildImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListServicesCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectVolumeCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveNetworkCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListTasksCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PushImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.WaitContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateServiceCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateServiceCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CopyArchiveToContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PingCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.StatsCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ExecStartCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.LeaveSwarmCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.TopContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.StopContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListNetworksCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListImagesCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListVolumesCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ContainerDiffCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.EventsCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveServiceCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.model.AuthConfig"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.LogContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ConnectToNetworkCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectNetworkCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.DisconnectFromNetworkCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InfoCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CopyArchiveFromContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateSwarmNodeCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RenameContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CommitCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectExecCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.StartContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InitializeSwarmCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.LoadImageCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateVolumeCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectServiceCmd"), true);
	}
	
	public void testModelsWithFalseResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RestartContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.AttachContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ExecCreateCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PauseContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PullImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.KillContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.SaveImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListContainersCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListSwarmNodesCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectSwarmCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.VersionCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateNetworkCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UnpauseContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.JoinSwarmCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CopyFileFromContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.TagImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.SearchImagesCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveVolumeCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateSwarmCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.BuildImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListServicesCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectVolumeCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveNetworkCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListTasksCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PushImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.WaitContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateServiceCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateServiceCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CopyArchiveToContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.PingCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.StatsCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ExecStartCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.LeaveSwarmCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.TopContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.StopContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListNetworksCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListImagesCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ListVolumesCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ContainerDiffCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.EventsCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RemoveServiceCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.model.AuthConfigFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.LogContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.ConnectToNetworkCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectNetworkCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.DisconnectFromNetworkCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InfoCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CopyArchiveFromContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateSwarmNodeCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RenameContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CommitCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectExecCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.StartContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.UpdateContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InitializeSwarmCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.LoadImageCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectContainerCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.CreateVolumeCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.InspectServiceCmdFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RestartContainerCmdFalse"), false);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DockerKindModelAnalyzer kkma = new DockerKindModelAnalyzer();
		ModelsHelper.showAllModels("Docker", kkma.getKindModels());
		ModelsHelper.testModelsWithTrueResults(kkma.getKindModels().values());
		ModelsHelper.testModelsWithFalseResults(kkma.getKindModels().values());
	}

}

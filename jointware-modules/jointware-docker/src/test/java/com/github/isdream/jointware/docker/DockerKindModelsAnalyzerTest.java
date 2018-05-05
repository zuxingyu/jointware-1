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
	
	public void testModelsWithFalseResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("com.github.dockerjava.api.command.RestartContainerCmd"), true);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.AttachContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.ExecCreateCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.PauseContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.PullImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.KillContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.SaveImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListContainersCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListSwarmNodesCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.InspectSwarmCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.CreateNetworkCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.VersionCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.JoinSwarmCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.UnpauseContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CopyFileFromContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.TagImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RemoveVolumeCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.UpdateSwarmCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.SearchImagesCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.BuildImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.InspectImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListServicesCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RemoveImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.InspectVolumeCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RemoveNetworkCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListTasksCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.PushImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.WaitContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CreateServiceCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.UpdateServiceCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CopyArchiveToContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.PingCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.StatsCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.ExecStartCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.LeaveSwarmCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.TopContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.StopContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListNetworksCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RemoveContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListVolumesCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ListImagesCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.ContainerDiffCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.EventsCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RemoveServiceCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.LogContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CreateImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.ConnectToNetworkCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.DisconnectFromNetworkCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.InfoCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CopyArchiveFromContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.UpdateSwarmNodeCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RenameContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CommitCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.InspectExecCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.UpdateContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.StartContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.InitializeSwarmCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.LoadImageCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.CreateContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.InspectContainerCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.dockerjava.core.command.CreateVolumeCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.InspectServiceCmdImplFalse"), false);
		Assert.assertEquals(models.contains("com.github.isdream.jointware.docker.adapter.command.RestartContainerCmdImplFalse"), false);
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

/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.docker.adapter;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.AttachContainerCmd;
import com.github.dockerjava.api.command.AuthCmd;
import com.github.dockerjava.api.command.BuildImageCmd;
import com.github.dockerjava.api.command.CommitCmd;
import com.github.dockerjava.api.command.ConnectToNetworkCmd;
import com.github.dockerjava.api.command.ContainerDiffCmd;
import com.github.dockerjava.api.command.CopyArchiveFromContainerCmd;
import com.github.dockerjava.api.command.CopyArchiveToContainerCmd;
import com.github.dockerjava.api.command.CopyFileFromContainerCmd;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateImageCmd;
import com.github.dockerjava.api.command.CreateNetworkCmd;
import com.github.dockerjava.api.command.CreateServiceCmd;
import com.github.dockerjava.api.command.CreateVolumeCmd;
import com.github.dockerjava.api.command.DisconnectFromNetworkCmd;
import com.github.dockerjava.api.command.DockerCmdExecFactory;
import com.github.dockerjava.api.command.EventsCmd;
import com.github.dockerjava.api.command.ExecCreateCmd;
import com.github.dockerjava.api.command.ExecStartCmd;
import com.github.dockerjava.api.command.InfoCmd;
import com.github.dockerjava.api.command.InitializeSwarmCmd;
import com.github.dockerjava.api.command.InspectContainerCmd;
import com.github.dockerjava.api.command.InspectExecCmd;
import com.github.dockerjava.api.command.InspectImageCmd;
import com.github.dockerjava.api.command.InspectNetworkCmd;
import com.github.dockerjava.api.command.InspectServiceCmd;
import com.github.dockerjava.api.command.InspectSwarmCmd;
import com.github.dockerjava.api.command.InspectVolumeCmd;
import com.github.dockerjava.api.command.JoinSwarmCmd;
import com.github.dockerjava.api.command.KillContainerCmd;
import com.github.dockerjava.api.command.LeaveSwarmCmd;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.command.ListNetworksCmd;
import com.github.dockerjava.api.command.ListServicesCmd;
import com.github.dockerjava.api.command.ListSwarmNodesCmd;
import com.github.dockerjava.api.command.ListTasksCmd;
import com.github.dockerjava.api.command.ListVolumesCmd;
import com.github.dockerjava.api.command.LoadImageCmd;
import com.github.dockerjava.api.command.LogContainerCmd;
import com.github.dockerjava.api.command.PauseContainerCmd;
import com.github.dockerjava.api.command.PingCmd;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.PushImageCmd;
import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.command.RemoveImageCmd;
import com.github.dockerjava.api.command.RemoveNetworkCmd;
import com.github.dockerjava.api.command.RemoveServiceCmd;
import com.github.dockerjava.api.command.RemoveVolumeCmd;
import com.github.dockerjava.api.command.RenameContainerCmd;
import com.github.dockerjava.api.command.RestartContainerCmd;
import com.github.dockerjava.api.command.SaveImageCmd;
import com.github.dockerjava.api.command.SearchImagesCmd;
import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.api.command.StatsCmd;
import com.github.dockerjava.api.command.StopContainerCmd;
import com.github.dockerjava.api.command.TagImageCmd;
import com.github.dockerjava.api.command.TopContainerCmd;
import com.github.dockerjava.api.command.UnpauseContainerCmd;
import com.github.dockerjava.api.command.UpdateContainerCmd;
import com.github.dockerjava.api.command.UpdateServiceCmd;
import com.github.dockerjava.api.command.UpdateSwarmCmd;
import com.github.dockerjava.api.command.UpdateSwarmNodeCmd;
import com.github.dockerjava.api.command.VersionCmd;
import com.github.dockerjava.api.command.WaitContainerCmd;
import com.github.dockerjava.api.model.AuthConfig;
import com.github.dockerjava.api.model.Identifier;
import com.github.dockerjava.api.model.ServiceSpec;
import com.github.dockerjava.api.model.SwarmSpec;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.command.AttachContainerCmdImpl;
import com.github.dockerjava.core.command.AuthCmdImpl;
import com.github.dockerjava.core.command.BuildImageCmdImpl;
import com.github.dockerjava.core.command.CommitCmdImpl;
import com.github.dockerjava.core.command.ConnectToNetworkCmdImpl;
import com.github.dockerjava.core.command.ContainerDiffCmdImpl;
import com.github.dockerjava.core.command.CopyArchiveFromContainerCmdImpl;
import com.github.dockerjava.core.command.CopyArchiveToContainerCmdImpl;
import com.github.dockerjava.core.command.CopyFileFromContainerCmdImpl;
import com.github.dockerjava.core.command.CreateContainerCmdImpl;
import com.github.dockerjava.core.command.CreateImageCmdImpl;
import com.github.dockerjava.core.command.CreateNetworkCmdImpl;
import com.github.dockerjava.core.command.CreateServiceCmdImpl;
import com.github.dockerjava.core.command.CreateVolumeCmdImpl;
import com.github.dockerjava.core.command.DisconnectFromNetworkCmdImpl;
import com.github.dockerjava.core.command.EventsCmdImpl;
import com.github.dockerjava.core.command.ExecCreateCmdImpl;
import com.github.dockerjava.core.command.ExecStartCmdImpl;
import com.github.dockerjava.core.command.InfoCmdImpl;
import com.github.dockerjava.core.command.InitializeSwarmCmdImpl;
import com.github.dockerjava.core.command.InpectNetworkCmdImpl;
import com.github.dockerjava.core.command.InspectContainerCmdImpl;
import com.github.dockerjava.core.command.InspectExecCmdImpl;
import com.github.dockerjava.core.command.InspectImageCmdImpl;
import com.github.dockerjava.core.command.InspectServiceCmdImpl;
import com.github.dockerjava.core.command.InspectSwarmCmdImpl;
import com.github.dockerjava.core.command.InspectVolumeCmdImpl;
import com.github.dockerjava.core.command.JoinSwarmCmdImpl;
import com.github.dockerjava.core.command.KillContainerCmdImpl;
import com.github.dockerjava.core.command.LeaveSwarmCmdImpl;
import com.github.dockerjava.core.command.ListContainersCmdImpl;
import com.github.dockerjava.core.command.ListImagesCmdImpl;
import com.github.dockerjava.core.command.ListNetworksCmdImpl;
import com.github.dockerjava.core.command.ListServicesCmdImpl;
import com.github.dockerjava.core.command.ListSwarmNodesCmdImpl;
import com.github.dockerjava.core.command.ListTasksCmdImpl;
import com.github.dockerjava.core.command.ListVolumesCmdImpl;
import com.github.dockerjava.core.command.LoadImageCmdImpl;
import com.github.dockerjava.core.command.LogContainerCmdImpl;
import com.github.dockerjava.core.command.PauseContainerCmdImpl;
import com.github.dockerjava.core.command.PingCmdImpl;
import com.github.dockerjava.core.command.PullImageCmdImpl;
import com.github.dockerjava.core.command.PushImageCmdImpl;
import com.github.dockerjava.core.command.RemoveContainerCmdImpl;
import com.github.dockerjava.core.command.RemoveImageCmdImpl;
import com.github.dockerjava.core.command.RemoveNetworkCmdImpl;
import com.github.dockerjava.core.command.RemoveServiceCmdImpl;
import com.github.dockerjava.core.command.RemoveVolumeCmdImpl;
import com.github.dockerjava.core.command.RenameContainerCmdImpl;
import com.github.dockerjava.core.command.RestartContainerCmdImpl;
import com.github.dockerjava.core.command.SaveImageCmdImpl;
import com.github.dockerjava.core.command.SearchImagesCmdImpl;
import com.github.dockerjava.core.command.StartContainerCmdImpl;
import com.github.dockerjava.core.command.StatsCmdImpl;
import com.github.dockerjava.core.command.StopContainerCmdImpl;
import com.github.dockerjava.core.command.TagImageCmdImpl;
import com.github.dockerjava.core.command.TopContainerCmdImpl;
import com.github.dockerjava.core.command.UnpauseContainerCmdImpl;
import com.github.dockerjava.core.command.UpdateContainerCmdImpl;
import com.github.dockerjava.core.command.UpdateServiceCmdImpl;
import com.github.dockerjava.core.command.UpdateSwarmCmdImpl;
import com.github.dockerjava.core.command.UpdateSwarmNodeCmdImpl;
import com.github.dockerjava.core.command.VersionCmdImpl;
import com.github.dockerjava.core.command.WaitContainerCmdImpl;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2018/5/5
 *
 */
public class DockerClientImpl implements Closeable, DockerClient {

	protected final DockerClientConfig dockerClientConfig;

	protected DockerCmdExecFactory dockerCmdExecFactory;

	protected DockerClientImpl() {
        this(DefaultDockerClientConfig.createDefaultConfigBuilder().build());
    }

	protected DockerClientImpl(String serverUrl) {
        this(configWithServerUrl(serverUrl));
    }

	protected DockerClientImpl(DockerClientConfig dockerClientConfig) {
        checkNotNull(dockerClientConfig, "config was not specified");
        this.dockerClientConfig = dockerClientConfig;
    }

	protected static DockerClientConfig configWithServerUrl(String serverUrl) {
        return DefaultDockerClientConfig.createDefaultConfigBuilder().withDockerHost(serverUrl).build();
    }

    public static DockerClientImpl getInstance() {
        return new DockerClientImpl();
    }

    public static DockerClientImpl getInstance(DockerClientConfig dockerClientConfig) {
        return new DockerClientImpl(dockerClientConfig);
    }

    public static DockerClientImpl getInstance(String serverUrl) {
        return new DockerClientImpl(serverUrl);
    }

    public DockerClientImpl withDockerCmdExecFactory(DockerCmdExecFactory dockerCmdExecFactory) {
        checkNotNull(dockerCmdExecFactory, "dockerCmdExecFactory was not specified");
        this.dockerCmdExecFactory = dockerCmdExecFactory;
        this.dockerCmdExecFactory.init(dockerClientConfig);
        return this;
    }

    private DockerCmdExecFactory getDockerCmdExecFactory() {
        checkNotNull(dockerCmdExecFactory, "dockerCmdExecFactory was not specified");
        return dockerCmdExecFactory;
    }

    @Override
    public AuthConfig authConfig() {
        checkNotNull(dockerClientConfig.getRegistryUsername(), "Configured username is null.");
        checkNotNull(dockerClientConfig.getRegistryUrl(), "Configured serverAddress is null.");

        return new AuthConfig()
                .withUsername(dockerClientConfig.getRegistryUsername())
                .withPassword(dockerClientConfig.getRegistryPassword())
                .withEmail(dockerClientConfig.getRegistryEmail())
                .withRegistryAddress(dockerClientConfig.getRegistryUrl());
    }

    /**
     * * MISC API *
     */

    /**
     * Authenticate with the server, useful for checking authentication.
     */
    @Override
    public AuthCmd authCmd() {
        return new AuthCmdImpl(getDockerCmdExecFactory().createAuthCmdExec(), authConfig());
    }

    @Override
    public InfoCmd infoCmd() {
        return new InfoCmdImpl(getDockerCmdExecFactory().createInfoCmdExec());
    }

    @Override
    public PingCmd pingCmd() {
        return new PingCmdImpl(getDockerCmdExecFactory().createPingCmdExec());
    }

    @Override
    public VersionCmd versionCmd() {
        return new VersionCmdImpl(getDockerCmdExecFactory().createVersionCmdExec());
    }

    /**
     * * IMAGE API *
     */
    @Override
    public PullImageCmd pullImageCmd(String repository) {
        return new PullImageCmdImpl(getDockerCmdExecFactory().createPullImageCmdExec(),
                dockerClientConfig.effectiveAuthConfig(repository), repository);
    }

    @Override
    public PushImageCmd pushImageCmd(String name) {
        PushImageCmd cmd = new PushImageCmdImpl(getDockerCmdExecFactory().createPushImageCmdExec(),
                dockerClientConfig.effectiveAuthConfig(name), name);
        return cmd;
    }

    @Override
    public PushImageCmd pushImageCmd(Identifier identifier) {
        PushImageCmd cmd = pushImageCmd(identifier.repository.name);
        if (identifier.tag.isPresent()) {
            cmd.withTag(identifier.tag.get());
        }

        AuthConfig cfg = dockerClientConfig.effectiveAuthConfig(identifier.repository.name);
        if (cfg != null) {
            cmd.withAuthConfig(cfg);
        }

        return cmd;
    }

    @Override
    public SaveImageCmd saveImageCmd(String name) {
        return new SaveImageCmdImpl(getDockerCmdExecFactory().createSaveImageCmdExec(), name);
    }

    @Override
    public CreateImageCmd createImageCmd(String repository, InputStream imageStream) {
        return new CreateImageCmdImpl(getDockerCmdExecFactory().createCreateImageCmdExec(), repository, imageStream);
    }

    @Override
    public LoadImageCmd loadImageCmd(InputStream imageStream) {
        return new LoadImageCmdImpl(getDockerCmdExecFactory().createLoadImageCmdExec(), imageStream);
    }

    @Override
    public SearchImagesCmd searchImagesCmd(String term) {
        return new SearchImagesCmdImpl(getDockerCmdExecFactory().createSearchImagesCmdExec(), term);
    }

    @Override
    public RemoveImageCmd removeImageCmd(String imageId) {
        return new RemoveImageCmdImpl(getDockerCmdExecFactory().createRemoveImageCmdExec(), imageId);
    }

    @Override
    public ListImagesCmd listImagesCmd() {
        return new ListImagesCmdImpl(getDockerCmdExecFactory().createListImagesCmdExec());
    }

    @Override
    public InspectImageCmd inspectImageCmd(String imageId) {
        return new InspectImageCmdImpl(getDockerCmdExecFactory().createInspectImageCmdExec(), imageId);
    }

    /**
     * * CONTAINER API *
     */

    @Override
    public ListContainersCmd listContainersCmd() {
        return new ListContainersCmdImpl(getDockerCmdExecFactory().createListContainersCmdExec());
    }

    @Override
    public CreateContainerCmd createContainerCmd(String image) {
        return new CreateContainerCmdImpl(getDockerCmdExecFactory()
                .createCreateContainerCmdExec(), dockerClientConfig.effectiveAuthConfig(image), image);
    }

    
    @Override
    public StartContainerCmd startContainerCmd(String containerId) {
        return new StartContainerCmdImpl(getDockerCmdExecFactory().createStartContainerCmdExec(), containerId);
    }

    @Override
    public InspectContainerCmd inspectContainerCmd(String containerId) {
        return new InspectContainerCmdImpl(getDockerCmdExecFactory().createInspectContainerCmdExec(), containerId);
    }

    @Override
    public ExecCreateCmd execCreateCmd(String containerId) {
        return new ExecCreateCmdImpl(getDockerCmdExecFactory().createExecCmdExec(), containerId);
    }

    @Override
    public RemoveContainerCmd removeContainerCmd(String containerId) {
        return new RemoveContainerCmdImpl(getDockerCmdExecFactory().createRemoveContainerCmdExec(), containerId);
    }

    @Override
    public WaitContainerCmd waitContainerCmd(String containerId) {
        return new WaitContainerCmdImpl(getDockerCmdExecFactory().createWaitContainerCmdExec(), containerId);
    }

    @Override
    public AttachContainerCmd attachContainerCmd(String containerId) {
        return new AttachContainerCmdImpl(getDockerCmdExecFactory().createAttachContainerCmdExec(), containerId);
    }

    @Override
    public ExecStartCmd execStartCmd(String execId) {
        return new ExecStartCmdImpl(getDockerCmdExecFactory().createExecStartCmdExec(), execId);
    }

    @Override
    public InspectExecCmd inspectExecCmd(String execId) {
        return new InspectExecCmdImpl(getDockerCmdExecFactory().createInspectExecCmdExec(), execId);
    }

    @Override
    public LogContainerCmd logContainerCmd(String containerId) {
        return new LogContainerCmdImpl(getDockerCmdExecFactory().createLogContainerCmdExec(), containerId);
    }

    @Override
    public CopyFileFromContainerCmd copyFileFromContainerCmd(String containerId, String resource) {
        return new CopyFileFromContainerCmdImpl(getDockerCmdExecFactory().createCopyFileFromContainerCmdExec(),
                containerId, resource);
    }

    @Override
    public CopyArchiveFromContainerCmd copyArchiveFromContainerCmd(String containerId, String resource) {
        return new CopyArchiveFromContainerCmdImpl(getDockerCmdExecFactory().createCopyArchiveFromContainerCmdExec(),
                containerId, resource);
    }

    @Override
    public CopyArchiveToContainerCmd copyArchiveToContainerCmd(String containerId) {
        return new CopyArchiveToContainerCmdImpl(getDockerCmdExecFactory().createCopyArchiveToContainerCmdExec(),
                containerId);
    }

    @Override
    public ContainerDiffCmd containerDiffCmd(String containerId) {
        return new ContainerDiffCmdImpl(getDockerCmdExecFactory().createContainerDiffCmdExec(), containerId);
    }

    @Override
    public StopContainerCmd stopContainerCmd(String containerId) {
        return new StopContainerCmdImpl(getDockerCmdExecFactory().createStopContainerCmdExec(), containerId);
    }

    @Override
    public KillContainerCmd killContainerCmd(String containerId) {
        return new KillContainerCmdImpl(getDockerCmdExecFactory().createKillContainerCmdExec(), containerId);
    }

    @Override
    public UpdateContainerCmd updateContainerCmd(String containerId) {
        return new UpdateContainerCmdImpl(getDockerCmdExecFactory().createUpdateContainerCmdExec(), containerId);
    }

    @Override
    public RenameContainerCmd renameContainerCmd(String containerId) {
        return new RenameContainerCmdImpl(getDockerCmdExecFactory().createRenameContainerCmdExec(), containerId);
    }

    @Override
    public RestartContainerCmd restartContainerCmd(String containerId) {
        return new RestartContainerCmdImpl(getDockerCmdExecFactory().createRestartContainerCmdExec(), containerId);
    }

    @Override
    public CommitCmd commitCmd(String containerId) {
        return new CommitCmdImpl(getDockerCmdExecFactory().createCommitCmdExec(), containerId);
    }

    @Override
    public BuildImageCmd buildImageCmd() {
        return new BuildImageCmdImpl(getDockerCmdExecFactory().createBuildImageCmdExec());
    }

    @Override
    public BuildImageCmd buildImageCmd(File dockerFileOrFolder) {
        return new BuildImageCmdImpl(getDockerCmdExecFactory().createBuildImageCmdExec(), dockerFileOrFolder);
    }

    @Override
    public BuildImageCmd buildImageCmd(InputStream tarInputStream) {
        return new BuildImageCmdImpl(getDockerCmdExecFactory().createBuildImageCmdExec(), tarInputStream);
    }

    @Override
    public TopContainerCmd topContainerCmd(String containerId) {
        return new TopContainerCmdImpl(getDockerCmdExecFactory().createTopContainerCmdExec(), containerId);
    }

    @Override
    public TagImageCmd tagImageCmd(String imageId, String imageNameWithRepository, String tag) {
        return new TagImageCmdImpl(getDockerCmdExecFactory().createTagImageCmdExec(), imageId, imageNameWithRepository, tag);
    }

    @Override
    public PauseContainerCmd pauseContainerCmd(String containerId) {
        return new PauseContainerCmdImpl(getDockerCmdExecFactory().createPauseContainerCmdExec(), containerId);
    }

    @Override
    public UnpauseContainerCmd unpauseContainerCmd(String containerId) {
        return new UnpauseContainerCmdImpl(getDockerCmdExecFactory().createUnpauseContainerCmdExec(), containerId);
    }

    @Override
    public EventsCmd eventsCmd() {
        return new EventsCmdImpl(getDockerCmdExecFactory().createEventsCmdExec());
    }

    @Override
    public StatsCmd statsCmd(String containerId) {
        return new StatsCmdImpl(getDockerCmdExecFactory().createStatsCmdExec(), containerId);
    }

    @Override
    public CreateVolumeCmd createVolumeCmd() {
        return new CreateVolumeCmdImpl(getDockerCmdExecFactory().createCreateVolumeCmdExec());
    }

    @Override
    public InspectVolumeCmd inspectVolumeCmd(String name) {
        return new InspectVolumeCmdImpl(getDockerCmdExecFactory().createInspectVolumeCmdExec(), name);
    }

    @Override
    public RemoveVolumeCmd removeVolumeCmd(String name) {
        return new RemoveVolumeCmdImpl(getDockerCmdExecFactory().createRemoveVolumeCmdExec(), name);
    }

    @Override
    public ListVolumesCmd listVolumesCmd() {
        return new ListVolumesCmdImpl(getDockerCmdExecFactory().createListVolumesCmdExec());
    }

    @Override
    public ListNetworksCmd listNetworksCmd() {
        return new ListNetworksCmdImpl(getDockerCmdExecFactory().createListNetworksCmdExec());
    }

    @Override
    public InspectNetworkCmd inspectNetworkCmd() {
        return new InpectNetworkCmdImpl(getDockerCmdExecFactory().createInspectNetworkCmdExec());
    }

    @Override
    public CreateNetworkCmd createNetworkCmd() {
        return new CreateNetworkCmdImpl(getDockerCmdExecFactory().createCreateNetworkCmdExec());
    }

    @Override
    public RemoveNetworkCmd removeNetworkCmd(String networkId) {
        return new RemoveNetworkCmdImpl(getDockerCmdExecFactory().createRemoveNetworkCmdExec(), networkId);
    }

    @Override
    public ConnectToNetworkCmd connectToNetworkCmd() {
        return new ConnectToNetworkCmdImpl(getDockerCmdExecFactory().createConnectToNetworkCmdExec());
    }

    @Override
    public DisconnectFromNetworkCmd disconnectFromNetworkCmd() {
        return new DisconnectFromNetworkCmdImpl(getDockerCmdExecFactory().createDisconnectFromNetworkCmdExec());
    }

    @Override
    public InitializeSwarmCmd initializeSwarmCmd(SwarmSpec swarmSpec) {
        return new InitializeSwarmCmdImpl(getDockerCmdExecFactory().createInitializeSwarmCmdExec(), swarmSpec);
    }

    @Override
    public InspectSwarmCmd inspectSwarmCmd() {
        return new InspectSwarmCmdImpl(getDockerCmdExecFactory().createInspectSwarmCmdExec());
    }

    @Override
    public JoinSwarmCmd joinSwarmCmd() {
        return new JoinSwarmCmdImpl(getDockerCmdExecFactory().createJoinSwarmCmdExec());
    }

    @Override
    public LeaveSwarmCmd leaveSwarmCmd() {
        return new LeaveSwarmCmdImpl(getDockerCmdExecFactory().createLeaveSwarmCmdExec());
    }

    @Override
    public UpdateSwarmCmd updateSwarmCmd(SwarmSpec swarmSpec) {
        return new UpdateSwarmCmdImpl(getDockerCmdExecFactory().createUpdateSwarmCmdExec(), swarmSpec);
    }

    @Override
    public UpdateSwarmNodeCmd updateSwarmNodeCmd() {
        return new UpdateSwarmNodeCmdImpl(getDockerCmdExecFactory().updateSwarmNodeCmdExec());
    }

    @Override
    public ListSwarmNodesCmd listSwarmNodesCmd() {
        return new ListSwarmNodesCmdImpl(getDockerCmdExecFactory().listSwarmNodeCmdExec());
    }

    @Override public ListServicesCmd listServicesCmd() {
        return new ListServicesCmdImpl(getDockerCmdExecFactory().createListServicesCmdExec());
    }

    @Override
    public CreateServiceCmd createServiceCmd(ServiceSpec serviceSpec) {
        return new CreateServiceCmdImpl(getDockerCmdExecFactory().createCreateServiceCmdExec(), serviceSpec);
    }

    @Override
    public InspectServiceCmd inspectServiceCmd(String serviceId) {
        return new InspectServiceCmdImpl(getDockerCmdExecFactory().createInspectServiceCmdExec(), serviceId);
    }

    @Override
    public UpdateServiceCmd updateServiceCmd(String serviceId, ServiceSpec serviceSpec) {
        return new UpdateServiceCmdImpl(getDockerCmdExecFactory().createUpdateServiceCmdExec(), serviceId, serviceSpec);
    }

    @Override
    public RemoveServiceCmd removeServiceCmd(String serviceId) {
        return new RemoveServiceCmdImpl(getDockerCmdExecFactory().createRemoveServiceCmdExec(), serviceId);
    }

    @Override
    public ListTasksCmd listTasksCmd() {
        return new ListTasksCmdImpl(getDockerCmdExecFactory().listTasksCmdExec());
    }

    @Override
    public void close() throws IOException {
        getDockerCmdExecFactory().close();
    }
    
    /*********
     * 
     * 
     */
    
	public PullImageCmd pullImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.PullImageCmdImpl(getDockerCmdExecFactory().createPullImageCmdExec());
	}

	public CreateContainerCmd createContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CreateContainerCmdImpl(getDockerCmdExecFactory().createCreateContainerCmdExec());
	}

	public StartContainerCmd startContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.StartContainerCmdImpl(getDockerCmdExecFactory().createStartContainerCmdExec());
	}

	public InspectContainerCmd inspectContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.InspectContainerCmdImpl(getDockerCmdExecFactory().createInspectContainerCmdExec());
	}

	public RemoveContainerCmd removeContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RemoveContainerCmdImpl(getDockerCmdExecFactory().createRemoveContainerCmdExec());
	}

	public AttachContainerCmd attachContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.AttachContainerCmdImpl(getDockerCmdExecFactory().createAttachContainerCmdExec());
	}

	public CopyFileFromContainerCmd copyFileFromContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CopyFileFromContainerCmdImpl(getDockerCmdExecFactory().createCopyFileFromContainerCmdExec());
	}

	public CopyArchiveFromContainerCmd copyArchiveFromContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CopyArchiveFromContainerCmdImpl(getDockerCmdExecFactory().createCopyArchiveFromContainerCmdExec());
	}

	public CopyArchiveToContainerCmd copyArchiveToContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CopyArchiveToContainerCmdImpl(getDockerCmdExecFactory().createCopyArchiveToContainerCmdExec());
	}

	public UpdateContainerCmd updateContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.UpdateContainerCmdImpl(getDockerCmdExecFactory().createUpdateContainerCmdExec());
	}

	public RenameContainerCmd renameContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RenameContainerCmdImpl(getDockerCmdExecFactory().createRenameContainerCmdExec());
	}

	public RestartContainerCmd restartContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RestartContainerCmdImpl(getDockerCmdExecFactory().createRestartContainerCmdExec());
	}

	public PushImageCmd pushImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.PushImageCmdImpl(getDockerCmdExecFactory().createPushImageCmdExec());
	}


	public SaveImageCmd saveImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.SaveImageCmdImpl(getDockerCmdExecFactory().createSaveImageCmdExec());
	}

	public CreateImageCmd createImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CreateImageCmdImpl(getDockerCmdExecFactory().createCreateImageCmdExec());
	}

	public LoadImageCmd loadImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.LoadImageCmdImpl(getDockerCmdExecFactory().createLoadImageCmdExec());
	}

	public SearchImagesCmd searchImagesCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.SearchImagesCmdImpl(getDockerCmdExecFactory().createSearchImagesCmdExec());
	}

	public RemoveImageCmd removeImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RemoveImageCmdImpl(getDockerCmdExecFactory().createRemoveImageCmdExec());
	}

	public InspectImageCmd inspectImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.InspectImageCmdImpl(getDockerCmdExecFactory().createInspectImageCmdExec());
	}

	public ExecCreateCmd execCreateCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.ExecCreateCmdImpl(getDockerCmdExecFactory().createExecCmdExec());
	}

	public WaitContainerCmd waitContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.WaitContainerCmdImpl(getDockerCmdExecFactory().createWaitContainerCmdExec());
	}

	public ExecStartCmd execStartCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.ExecStartCmdImpl(getDockerCmdExecFactory().createExecStartCmdExec());
	}

	public InspectExecCmd inspectExecCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.InspectExecCmdImpl(getDockerCmdExecFactory().createInspectExecCmdExec());
	}

	public LogContainerCmd logContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.LogContainerCmdImpl(getDockerCmdExecFactory().createLogContainerCmdExec());
	}

	public ContainerDiffCmd containerDiffCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.ContainerDiffCmdImpl(getDockerCmdExecFactory().createContainerDiffCmdExec());
	}

	public StopContainerCmd stopContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.StopContainerCmdImpl(getDockerCmdExecFactory().createStopContainerCmdExec());
	}

	public KillContainerCmd killContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.KillContainerCmdImpl(getDockerCmdExecFactory().createKillContainerCmdExec());
	}

	public CommitCmd commitCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CommitCmdImpl(getDockerCmdExecFactory().createCommitCmdExec());
	}

	public TopContainerCmd topContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.TopContainerCmdImpl(getDockerCmdExecFactory().createTopContainerCmdExec());
	}

	public TagImageCmd tagImageCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.TagImageCmdImpl(getDockerCmdExecFactory().createTagImageCmdExec());
	}

	public StatsCmd statsCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.StatsCmdImpl(getDockerCmdExecFactory().createStatsCmdExec());
	}

	public InspectVolumeCmd inspectVolumeCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.InspectVolumeCmdImpl(getDockerCmdExecFactory().createInspectVolumeCmdExec());
	}

	public RemoveVolumeCmd removeVolumeCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RemoveVolumeCmdImpl(getDockerCmdExecFactory().createRemoveVolumeCmdExec());
	}

	public RemoveNetworkCmd removeNetworkCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RemoveNetworkCmdImpl(getDockerCmdExecFactory().createRemoveNetworkCmdExec());
	}

	public UpdateSwarmCmd updateSwarmCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.UpdateSwarmCmdImpl(getDockerCmdExecFactory().createUpdateSwarmCmdExec());
	}

	public CreateServiceCmd createServiceCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.CreateServiceCmdImpl(getDockerCmdExecFactory().createCreateServiceCmdExec());
	}

	public UpdateServiceCmd updateServiceCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.UpdateServiceCmdImpl(getDockerCmdExecFactory().createUpdateServiceCmdExec());
	}

	public RemoveServiceCmd removeServiceCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.RemoveServiceCmdImpl(getDockerCmdExecFactory().createRemoveServiceCmdExec());
	}

	public PauseContainerCmd pauseContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.PauseContainerCmdImpl(getDockerCmdExecFactory().createPauseContainerCmdExec());
	}

	public UnpauseContainerCmd unpauseContainerCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.UnpauseContainerCmdImpl(getDockerCmdExecFactory().createUnpauseContainerCmdExec());
	}

	public InitializeSwarmCmd initializeSwarmCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.InitializeSwarmCmdImpl(getDockerCmdExecFactory().createInitializeSwarmCmdExec());
	}

	public InspectServiceCmd inspectServiceCmd() {
		return new com.github.isdream.jointware.docker.adapter.command.InspectServiceCmdImpl(getDockerCmdExecFactory().createInspectServiceCmdExec());
	}


    
    /***
     * 
     * 
     ***/
    public final static String VERSION = "3.1.0-rc-3";
	
	protected final static Set<String> ignores = new HashSet<String>();
	
	static {
		ignores.add("BuildImageCmdImpl");
	}
	
    public static void main(String[] args) throws Exception {
    	Set<String> names = new HashSet<String>();
    	for (Method method : DockerClientImpl.class.getMethods()) {
    		String simpleName = method.getReturnType().getSimpleName();
    		if (method.getParameterCount() == 0) {
    			continue;
    		}
			if (!simpleName.endsWith("Cmd") || ignores.contains(simpleName + "Impl")) {
    			continue;
    		}
    		adapterConstructor(names, method);
    		adapterMethods(method);
    	}
    }

	protected static void adapterConstructor(Set<String> names, Method method) throws IOException {
		if (method.getParameterCount() != 0 && !names.contains(method.getName())
				&& method.getReturnType().getSimpleName().endsWith("Cmd")) {
			names.add(method.getName());
			String name = method.getReturnType().getSimpleName() + "Impl";
			String readJava = readJava(getURL(name), name);
			PrintWriter pw = new PrintWriter(new FileWriter(getLocal(name))); 
			pw.write(readJava);
			pw.close();
		}
	}

    protected static String getParentClass(Method method) {
    	return "com.github.dockerjava.core.command." 
				+ method.getReturnType().getSimpleName() + "Impl";
    }
    
    protected static File getLocal(String name) {
    	return new File("src/main/java/com/github/isdream/jointware/docker/adapter/command",  name + ".java");
    }
    
    protected static String getURL(String name) {
    	return "https://raw.githubusercontent.com/docker-java/docker-java/" + VERSION 
    			+ "/src/main/java/com/github/dockerjava/core/command/" + name + ".java";
    }
    
    protected static String readJava (String url, String name) {  
        StringBuilder sb = new StringBuilder();  
        try {  
            URLConnection uc = new URL(url).openConnection();  
            BufferedReader in = new BufferedReader(
            		new InputStreamReader(uc.getInputStream(),"UTF-8"));  
            String readline = null;  
            boolean enrichConstructor = true;
            boolean enrichImport = true;
            while ( (readline = in.readLine()) != null) {
            	if (readline.startsWith("package ")) {
            		sb.append(getPackageSyntax()).append("\n");
            	} else {
            		if (readline.contains("public")
                			&& readline.contains(" " + name + "(")
                			&& enrichConstructor) {
            			try {
            				int startIdx = readline.indexOf("(");
                			int endIdx = readline.indexOf("Exec");
                			String realName = readline.substring(startIdx, endIdx) + "Exec";
                			sb.append("\tpublic " + name + realName + " exec) {").append("\n");
                			sb.append("\t\tsuper(exec);").append("\n");
                			sb.append("\t}").append("\n\n");
                			enrichConstructor = false;
            			} catch (Exception e) {
            				// ignore here
            			}
            		} else if (readline.contains("import")
            				&& enrichImport) {
            			sb.append("import com.github.dockerjava.core.command.*;").append("\n");
            			enrichImport = false;
            		}
            		sb.append(readline).append("\n");
            	}
            }  
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return sb.toString();  
    }
    
    protected static String getPackageSyntax() {
    	return "package " + getPackageName() + ";";
    }
    
    protected static String getPackageName() {
    	return "com.github.isdream.jointware.docker.adapter.command";
    }
    
	protected static void adapterMethods(Method method) {
		System.out.println("\tpublic " 
						+ method.getReturnType().getSimpleName() + " "
						+ method.getName() + "() {");
		System.out.println("\t\treturn new " 
				+ getPackageName() + "."
				+ method.getReturnType().getSimpleName() 
				+ "Impl(getDockerCmdExecFactory().create"
				+ method.getReturnType().getSimpleName()
				+ "Exec());");
		System.out.println("\t}\n");
	}
	
}

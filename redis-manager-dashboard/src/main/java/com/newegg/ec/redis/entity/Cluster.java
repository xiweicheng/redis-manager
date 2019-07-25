package com.newegg.ec.redis.entity;

/**
 * 描述集群基本情况
 * @author Jay.H.Zou
 * @date 7/19/2019
 */
public class Cluster {

    private String clusterId;

    private String groupId;

    private String userId;

    private String token;

    private String clusterName;

    private String nodes;

    private String redisMode;

    private String os;

    private String version;

    /**
     * 集群 key 总数
     */
    private long totalKeys;

    /**
     * 集群 expire 总数
     */
    private long totalExpires;

    private String clusterPass;

    private ClusterType clusterType;

}
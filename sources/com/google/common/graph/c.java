package com.google.common.graph;

import mo.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f34204a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f34205b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static final int f34206c = 20;

    /* renamed from: d, reason: collision with root package name */
    public static final float f34207d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final int f34208e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final String f34209f = "Node %s is not an element of this graph.";

    /* renamed from: g, reason: collision with root package name */
    public static final String f34210g = "Edge %s is not an element of this graph.";

    /* renamed from: h, reason: collision with root package name */
    public static final String f34211h = "Node %s that was used to generate this set is no longer in the graph.";

    /* renamed from: i, reason: collision with root package name */
    public static final String f34212i = "Node %s or node %s that were used to generate this set are no longer in the graph.";

    /* renamed from: j, reason: collision with root package name */
    public static final String f34213j = "Edge %s that was used to generate this set is no longer in the graph.";

    /* renamed from: k, reason: collision with root package name */
    public static final String f34214k = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";

    /* renamed from: l, reason: collision with root package name */
    public static final String f34215l = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";

    /* renamed from: m, reason: collision with root package name */
    public static final String f34216m = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";

    /* renamed from: n, reason: collision with root package name */
    public static final String f34217n = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* renamed from: o, reason: collision with root package name */
    public static final String f34218o = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";

    /* renamed from: p, reason: collision with root package name */
    public static final String f34219p = "Edge %s already exists in the graph.";

    /* renamed from: q, reason: collision with root package name */
    public static final String f34220q = "Mismatch: endpoints' ordering is not compatible with directionality of the graph";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        EDGE_EXISTS
    }
}

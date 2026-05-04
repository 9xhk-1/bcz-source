package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Cache {
    Pools.Pool<ArrayRow> mOptimizedArrayRowPool = new Pools.SimplePool(256);
    Pools.Pool<ArrayRow> mArrayRowPool = new Pools.SimplePool(256);
    Pools.Pool<SolverVariable> mSolverVariablePool = new Pools.SimplePool(256);
    SolverVariable[] mIndexedVariables = new SolverVariable[32];
}

package com.baicizhan.client.business.util;

import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt$addOnTabSelectedClosure$4\n*L\n1#1,194:1\n*E\n"})
/* loaded from: classes4.dex */
public final class KotlinExtKt$addOnTabSelectedClosure$4 implements TabLayout.f {
    final /* synthetic */ x00.l<TabLayout.i, g2> $onTabReselected;
    final /* synthetic */ x00.l<TabLayout.i, g2> $onTabSelected;
    final /* synthetic */ x00.l<TabLayout.i, g2> $onTabUnSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinExtKt$addOnTabSelectedClosure$4(x00.l<? super TabLayout.i, g2> lVar, x00.l<? super TabLayout.i, g2> lVar2, x00.l<? super TabLayout.i, g2> lVar3) {
        this.$onTabSelected = lVar;
        this.$onTabUnSelected = lVar2;
        this.$onTabReselected = lVar3;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(TabLayout.i iVar) {
        this.$onTabReselected.invoke(iVar);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(TabLayout.i iVar) {
        this.$onTabSelected.invoke(iVar);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(TabLayout.i iVar) {
        this.$onTabUnSelected.invoke(iVar);
    }
}

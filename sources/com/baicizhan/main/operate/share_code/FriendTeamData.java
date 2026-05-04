package com.baicizhan.main.operate.share_code;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class FriendTeamData implements NoProguard {
    public static final int $stable = 0;

    @l
    private final ButtonInfo cancel;

    @l
    private final ButtonInfo confirm;

    @l
    private final String content;

    @l
    private final String img;

    @l
    private final String title;

    public FriendTeamData(@l String str, @l String str2, @l String str3, @l ButtonInfo buttonInfo, @l ButtonInfo buttonInfo2) {
        this.img = str;
        this.title = str2;
        this.content = str3;
        this.confirm = buttonInfo;
        this.cancel = buttonInfo2;
    }

    public static /* synthetic */ FriendTeamData copy$default(FriendTeamData friendTeamData, String str, String str2, String str3, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = friendTeamData.img;
        }
        if ((i11 & 2) != 0) {
            str2 = friendTeamData.title;
        }
        if ((i11 & 4) != 0) {
            str3 = friendTeamData.content;
        }
        if ((i11 & 8) != 0) {
            buttonInfo = friendTeamData.confirm;
        }
        if ((i11 & 16) != 0) {
            buttonInfo2 = friendTeamData.cancel;
        }
        ButtonInfo buttonInfo3 = buttonInfo2;
        String str4 = str3;
        return friendTeamData.copy(str, str2, str4, buttonInfo, buttonInfo3);
    }

    @l
    public final String component1() {
        return this.img;
    }

    @l
    public final String component2() {
        return this.title;
    }

    @l
    public final String component3() {
        return this.content;
    }

    @l
    public final ButtonInfo component4() {
        return this.confirm;
    }

    @l
    public final ButtonInfo component5() {
        return this.cancel;
    }

    @k
    public final FriendTeamData copy(@l String str, @l String str2, @l String str3, @l ButtonInfo buttonInfo, @l ButtonInfo buttonInfo2) {
        return new FriendTeamData(str, str2, str3, buttonInfo, buttonInfo2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendTeamData)) {
            return false;
        }
        FriendTeamData friendTeamData = (FriendTeamData) obj;
        return g0.g(this.img, friendTeamData.img) && g0.g(this.title, friendTeamData.title) && g0.g(this.content, friendTeamData.content) && g0.g(this.confirm, friendTeamData.confirm) && g0.g(this.cancel, friendTeamData.cancel);
    }

    @l
    public final ButtonInfo getCancel() {
        return this.cancel;
    }

    @l
    public final ButtonInfo getConfirm() {
        return this.confirm;
    }

    @l
    public final String getContent() {
        return this.content;
    }

    @l
    public final String getImg() {
        return this.img;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.img;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ButtonInfo buttonInfo = this.confirm;
        int hashCode4 = (hashCode3 + (buttonInfo == null ? 0 : buttonInfo.hashCode())) * 31;
        ButtonInfo buttonInfo2 = this.cancel;
        return hashCode4 + (buttonInfo2 != null ? buttonInfo2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "FriendTeamData(img=" + this.img + ", title=" + this.title + ", content=" + this.content + ", confirm=" + this.confirm + ", cancel=" + this.cancel + j.f81007d;
    }
}

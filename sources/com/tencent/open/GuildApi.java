package com.tencent.open;

import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class GuildApi extends BaseApi {
    public static final int CREATE_GUILD_ERROR_ALREADY_EXIST = -1;
    public static final int JOIN_GUILD_ERROR_NOT_EXIST = -1;

    public GuildApi(QQToken qQToken) {
        super(qQToken);
    }
}

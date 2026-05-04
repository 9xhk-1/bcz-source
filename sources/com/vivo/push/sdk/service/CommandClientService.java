package com.vivo.push.sdk.service;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CommandClientService extends CommandService {
    @Override // com.vivo.push.sdk.service.CommandService
    public final boolean a(String str) {
        return "com.vivo.pushclient.action.RECEIVE".equals(str);
    }
}

package com.baicizhan.client.business.managers.ad.entity;

import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.online.advertise_api.AdLink;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Action implements NoProguard {
    public static final int TYPE_APP = 3;
    public static final int TYPE_BROWSER = 2;
    public static final int TYPE_MINI = 4;
    public static final int TYPE_WEB = 1;
    public int jump_type;
    public String link;
    public String mini_program_id;
    public String mini_program_path;

    public static Action from(AdLink adLink) {
        if (adLink == null) {
            return null;
        }
        Action action = new Action();
        action.link = adLink.link;
        action.jump_type = adLink.jump_type;
        action.mini_program_id = adLink.mini_program_id;
        action.mini_program_path = adLink.mini_program_path;
        return action;
    }

    public String toString() {
        return "Action{link='" + this.link + "', jump_type=" + this.jump_type + ", mini_program_id='" + this.mini_program_id + "', mini_program_path='" + this.mini_program_path + '\'' + b.f69928j;
    }
}

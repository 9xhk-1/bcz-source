package com.baicizhan.client.friend.model;

import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.thrift.c;
import com.baicizhan.online.bs_socials.BBFeed;
import com.baicizhan.online.bs_socials.BBFriendInfo;
import com.baicizhan.online.bs_socials.BBFriendMsg;
import com.baicizhan.online.bs_socials.BBRankResult;
import com.baicizhan.online.bs_socials.BBSearchResult;
import com.baicizhan.online.bs_socials.BSSocials;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SocialNetwork {
    public static final String ACCOUNT_TYPE_QQ = "qq";
    public static final String ACCOUNT_TYPE_RENREN = "renren";
    public static final String ACCOUNT_TYPE_WEIBO = "weibo";
    public static final String ACCOUNT_TYPE_WEIXIN = "weixin";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener<T> {
        void onError(Exception e11);

        void onResult(T res);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class TransferRequest<T> extends ThriftRequest<BSSocials.Client, T> {
        private Listener<T> mTarget;

        public TransferRequest(String tag, Listener<T> target) {
            super("/rpc/socials", tag);
            this.mTarget = target;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            this.mTarget.onError(exception);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onResult(T t11) {
            this.mTarget.onResult(t11);
        }

        public void send() {
            c.b().a(this);
        }
    }

    public static void accept(String tag, final int msgId, final String publicKey, final Listener<Void> listener) {
        new TransferRequest<Void>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.2
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Void doInBackground(BSSocials.Client client) throws Exception {
                client.accept_friend_apply(msgId, publicKey);
                return null;
            }
        }.send();
    }

    public static void apply(String tag, final String publicKey, final Listener<Void> listener) {
        new TransferRequest<Void>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.1
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Void doInBackground(BSSocials.Client client) throws Exception {
                client.apply_friend(publicKey);
                return null;
            }
        }.send();
    }

    public static void checkHasNewFeed(String tag, Listener<Boolean> listener) {
        new TransferRequest<Boolean>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.10
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Boolean doInBackground(BSSocials.Client client) throws Exception {
                return Boolean.valueOf(client.has_new_feeds());
            }
        }.send();
    }

    public static void checkHasNewNotifications(String tag, final Listener<Boolean> listener) {
        new TransferRequest<Boolean>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.5
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Boolean doInBackground(BSSocials.Client client) throws Exception {
                return Boolean.valueOf(client.has_new_friend_msgs());
            }
        }.send();
    }

    public static void checkNotificationCount(String tag, final Listener<Integer> listener) {
        new TransferRequest<Integer>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.6
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Integer doInBackground(BSSocials.Client client) throws Exception {
                return Integer.valueOf(client.get_friend_msg_count());
            }
        }.send();
    }

    public static void deleteFriend(String tag, final String publicKey, final Listener<Void> listener) {
        new TransferRequest<Void>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.8
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Void doInBackground(BSSocials.Client client) throws Exception {
                client.delete_friend(publicKey);
                return null;
            }
        }.send();
    }

    public static void fetchFeed(String tag, final long before, Listener<List<BBFeed>> listener) {
        new TransferRequest<List<BBFeed>>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.11
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public List<BBFeed> doInBackground(BSSocials.Client client) throws Exception {
                return client.get_feeds(before);
            }
        }.send();
    }

    public static void fetchFriends(String tag, final Listener<List<BBFriendInfo>> listener) {
        new TransferRequest<List<BBFriendInfo>>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.4
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public List<BBFriendInfo> doInBackground(BSSocials.Client client) throws Exception {
                return client.get_friends();
            }
        }.send();
    }

    public static void fetchNotifications(String tag, final Listener<List<BBFriendMsg>> listener) {
        new TransferRequest<List<BBFriendMsg>>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.7
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public List<BBFriendMsg> doInBackground(BSSocials.Client client) throws Exception {
                return client.get_friend_msgs();
            }
        }.send();
    }

    public static void fetchRank(String tag, final Listener<BBRankResult> listener) {
        new TransferRequest<BBRankResult>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.9
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public BBRankResult doInBackground(BSSocials.Client client) throws Exception {
                return client.get_rank();
            }
        }.send();
    }

    public static void fetchSuggestedFriend(String tag, Listener<List<BBSearchResult>> listener) {
        new TransferRequest<List<BBSearchResult>>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.13
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public List<BBSearchResult> doInBackground(BSSocials.Client client) throws Exception {
                return client.get_suggest_friends();
            }
        }.send();
    }

    public static void ignore(String tag, final int msgId, final Listener<Void> listener) {
        new TransferRequest<Void>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.3
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public Void doInBackground(BSSocials.Client client) throws Exception {
                client.ignore_friend_apply(msgId);
                return null;
            }
        }.send();
    }

    public static void search(String tag, final String query, Listener<List<BBSearchResult>> listener) {
        new TransferRequest<List<BBSearchResult>>(tag, listener) { // from class: com.baicizhan.client.friend.model.SocialNetwork.12
            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public List<BBSearchResult> doInBackground(BSSocials.Client client) throws Exception {
                return client.search_user(query);
            }
        }.send();
    }
}

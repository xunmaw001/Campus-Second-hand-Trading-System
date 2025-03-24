<template>
    <view>
        <view class="cu-chat" style="margin-bottom: 280rpx;">
            <view v-for="(item,index) in shangjiaChatList" v-bind:key="index">
                <view v-if="item.shangjiaChatIssueText" class="cu-item self">
                    <view class="main">
                        <view class="content bg-green shadow" style="display:flex;flex-direction: column">
                            <text>{{item.shangjiaChatIssueText}}</text>
                            <image v-if="item.shangjiaChatIssuePhoto"
                                   :src="baseUrl+item.shangjiaChatIssuePhoto"></image>
                        </view>
                    </view>
                    <view class="cu-avatar radius" style="background-image:url(https://ossweb-img.qq.com/images/lol/web201310/skin/big107000.jpg);"></view>
                    <view class="date">{{item.insertTime}}</view>
                </view>
                <view v-if="item.shangjiaChatReplyText" class="cu-item">
                    <view class="cu-avatar radius" style="background-image:url(https://ossweb-img.qq.com/images/lol/web201310/skin/big143004.jpg);"></view>
                    <view class="main">
                        <view class="content shadow" style="display:flex;flex-direction: column">
                            <text>{{item.shangjiaChatReplyText}}</text>
                            <image v-if="item.shangjiaChatReplyPhoto"
                                   :src="baseUrl+item.shangjiaChatReplyPhoto"></image>
                        </view>
                    </view>
                    <view class="date ">{{item.updateTime}}</view>
                </view>
            </view>
        </view>
        <view class="cu-bar foot input" style="display: flex;flex-direction: column;padding: 10rpx;">
            <view style="width:100%;height:80rpx;padding: 0 10rpx;display: flex;justify-content: space-between;">
                <button @tap="onSendTap" class="cu-btn bg-green shadow" style="margin-top: 4px;">发送</button>
            </view>
            <view style="width: 100%;">
                <textarea v-model="shangjiaChatIssueText" placeholder="开始输入..."/>
            </view>
        </view>

    </view>
</template>

<script>
    export default {
        data() {
            return {
                // 定时器
                inter: {},
                shangjiaChatList: [],
                shangjiaChatIssueText: '',
                shangjiaChatIssuePhoto:""
            };
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            }
        },
        onLoad() {
            let _this = this;
            let inter = setInterval(function() {
                _this.init();
            }, 3000)
            this.inter = inter
        },
        onUnload() {
            if (this.inter) {
                // 清除定时器
                clearInterval(this.inter);
            }
        },
        methods: {
            shangjiaChatIssuePhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    console.log(res.file)
                    _this.shangjiaChatIssuePhoto = 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
            async onSendTap() {
                let _this = this
                await _this.$api.save('shangjiaChat', {
                    shangjiaChatIssueText: _this.shangjiaChatIssueText,
                    zhuangtaiTypes: 1,
                    shangjiaId:uni.getStorageSync('shangjiaId'),
                    shangjiaChatTypes: 1,
                    shangjiaChatIssuePhoto:_this.shangjiaChatIssuePhoto,
                    issueTime:new Date().getTime()
                });
                _this.shangjiaChatIssueText = '';
                _this.shangjiaChatIssuePhoto = '';
                _this.init();
            },
            async init() {
                let res = await this.$api.page('shangjiaChat', {
                    page: 1,
                    limit: 999,
                    order:"asc",
                    shangjiaId:uni.getStorageSync('shangjiaId')
                });
                this.shangjiaChatList = res.data.list;
            }
        }
    }
</script>


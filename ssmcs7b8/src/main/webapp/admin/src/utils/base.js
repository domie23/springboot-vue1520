const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmcs7b8/",
            name: "ssmcs7b8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmcs7b8/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "个人健康信息管理"
        } 
    }
}
export default base

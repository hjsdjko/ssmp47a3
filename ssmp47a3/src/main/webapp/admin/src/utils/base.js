const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmp47a3/",
            name: "ssmp47a3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmp47a3/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "绘画学习平台小程序"
        } 
    }
}
export default base

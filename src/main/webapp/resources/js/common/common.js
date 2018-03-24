/**
 * Created by Administrator on 2018/2/18.
 */
function changeVerifyCode(img) {
    img.src="../Kaptcha?"+Math.floor(Math.random()*100);
}
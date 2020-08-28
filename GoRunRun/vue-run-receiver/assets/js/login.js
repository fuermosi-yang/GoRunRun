$(function() {
    $('.switch #login').on('click', function() {
        $(this).addClass('current');
        $(this).siblings('p').removeClass('current');
        $('.switch').parent().addClass('login');
        $('.switch').parent().removeClass('register');
        $('button p').text('登录');
    });
    $('.switch #register').on('click', function() {
        $(this).addClass('current');
        $(this).siblings('p').removeClass('current');
        $('.switch').parent().addClass('register');
        $('.switch').parent().removeClass('login');
        $('button p').text('注册');
    });
    $('.input input').on('focus', function() {
        $(this).attr('placeholder', '');
    });
    $('.input input').on('blur', function() {
        $(this).attr('placeholder', $(this).attr('data'));
    });

    var lgh = $('.lightning li').length;
    $('.lightning li').each(function(i) {
        $(this).css({
            left: i * (100/lgh) + '%',
            bottom: randomNum(-20,10) + '%',
            animationDuration: randomNum(1,5) + 's'
        });
    });

    function randomNum (max, min) {
        var num = Math.floor(Math.random() * (max - min + 1) + min)
        return num;
    }

});
/**
 * base scripts
 */
(function ($) {

	var scrollbar =
		'<div class="scrollbar">' +
		'	<div class="btn-group-vertical">' +
		'		<button type="button" class="btn btn-default" id="go2top">' +
		'			<span class="glyphicon glyphicon-chevron-up"></span>' +
		'		</button>' +
		'		<button type="button" class="btn btn-default" id="refresh">' +
		'			<span class="glyphicon glyphicon-refresh"></span>' +
		'		</button>' +
		'		<button type="button" class="btn btn-default" id="go2bottom">' +
		'			<span class="glyphicon glyphicon-chevron-down"></span>' +
		'		</button>' +
		'	</div>' +
		'</div>';
	$("body").append(scrollbar);

	var scrollSpeed = 300;

	$("#go2top").click(function () {
		$('html, body').animate({scrollTop: 0}, scrollSpeed);
		return false;
	});

	$("#refresh").click(function () {
		window.location.reload(true);
		return false;
	});

	$("#go2bottom").click(function () {
		$('html, body').animate({scrollTop: $("footer").offset().top}, scrollSpeed);
		return false;
	});

})(jQuery);

(function ($) {
	/* 全选 */
	$(".checkAll").click(function () {
		$(this).closest("table").find(".checkItem").prop("checked", this.checked);
	});
})(jQuery);

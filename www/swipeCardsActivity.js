window.invokeCards = function(arg0, success, error) {
	cordova.exec(success, error, "swipecards", "invokeCards", [{'items': {
                                          'item1' : {
                                          'title':'helloworlds',
                                          'img': 'http://thesehumansarenuts.com/wp-content/uploads/2015/01/Nothing.jpg'
                                          },
                                          'item2' : {
                                          'title':'helloworld',
                                          'img': 'http://thesehumansarenuts.com/wp-content/uploads/2015/01/Nothing.jpg'
                                          }
                                      },
                                      'success': 'swipedRight',
                                      'failure': 'swipedLeft'
                                      }]);
};

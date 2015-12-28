/********* swipecards.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>
#import "DraggableViewBackground.h"

@interface swipecards : CDVPlugin {
    

    
}

-(void) invokeCards:(CDVInvokedUrlCommand*)command;

-(void) sendPluginResults;

@property (strong, nonatomic) UIView* overlay;
@property (strong, nonatomic) UIViewController* cardsView;
@property (strong, nonatomic) NSString* myCallBackID;
@property (strong, nonatomic) CDVPluginResult *pluginResult;

@end

@implementation swipecards

-(void) invokeCards:(CDVInvokedUrlCommand *)command {
    
    
    NSDictionary *dateStr = [command.arguments objectAtIndex:0];
    
    
    
    NSDictionary *items = [dateStr objectForKey:@"items"];
    
    NSString *successCallback = [dateStr objectForKey:@"success"];
    NSString *failureCallback = [dateStr objectForKey:@"failure"];
    
    self.cardsView = [[UIViewController alloc] init];
    
    
    DraggableViewBackground *draggableBackground = [[DraggableViewBackground alloc]initWithFrame:self.cardsView.view.frame];
    
    
    [draggableBackground setupViewWeb:self.webView];
    
    [draggableBackground setupData:items successCallback:successCallback failureCallback:failureCallback];
    
    [self.cardsView.view addSubview:draggableBackground];
    
    [self.viewController presentViewController:self.cardsView animated:YES
                                    completion:nil];
    
    
}

-(void) sendPluginResults {
    
    
}

@end

//
//  DraggableViewBackground.h
//  TinderCards
//
//  Created by Rahul Ravindran on 27/10/15.
//
//

#import <UIKit/UIKit.h>
#import "DraggableView.h"

@interface DraggableViewBackground : UIView <DraggableViewDelegate>

//methods called in DraggableView
-(void)cardSwipedLeft:(UIView *)card;
-(void)cardSwipedRight:(UIView *)card;

@property (retain,nonatomic)NSArray* exampleCardLabels; //%%% the labels the cards
@property (retain,nonatomic)NSMutableArray* allCards; //%%% the labels the cards
@property (nonatomic, strong) UIWebView* myWeb;
@property (retain,nonatomic) NSDictionary* items;
@property (nonatomic,strong) NSString* successCallback;
@property (nonatomic, strong) NSString* failurecallback;

-(void) setupViewWeb: (UIWebView *) myWebView;

-(void) setupData: (NSDictionary *) items successCallback: (NSString *) success failureCallback: (NSString *) failure;

@end
//
//  DraggableView.h
//  TinderCards
//
//  Created by Rahul Ravindran on 27/10/15.
//
//

#import <UIKit/UIKit.h>
#import "OverlayView.h"
#import <Cordova/CDV.h>



@protocol DraggableViewDelegate <NSObject>

-(void)cardSwipedLeft:(UIView *)card;
-(void)cardSwipedRight:(UIView *)card;

@end



@interface DraggableView : UIView

@property (assign) id <DraggableViewDelegate> delegate;



@property (nonatomic, strong)UIPanGestureRecognizer *panGestureRecognizer;
@property (nonatomic)CGPoint originalPoint;
@property (nonatomic,strong)OverlayView* overlayView;
@property (nonatomic,strong)UILabel* information; //%%% a placeholder for any card-specific information
@property (nonatomic, strong) UIImageView* imageView;
@property (nonatomic) NSInteger indexOfCard;

@property (strong, nonatomic) UIView* overlay;
@property (strong, nonatomic) UIViewController* cardsView;


-(void)leftClickAction;
-(void)rightClickAction;



@end
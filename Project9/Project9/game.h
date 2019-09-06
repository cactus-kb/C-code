#pragma once
#ifndef __GAME__H__
#define __GAME__H__

#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#define MINE_NUM 10

#include<stdio.h>
#include<time.h>
#include<stdlib.h>
#include<windows.h>

//≥ı ºªØ∆Â≈Ã
void InitBoard(char board[][COLS], int rows, int cols, char set);

//¥Ú”°∆Â≈Ã
void ShowBoard(char board[][COLS], int row, int col);

void SetMine(char mine[][COLS],int row,int col);

void FindMine(char mine[][COLS],char mineInfo[][COLS],int row,int col);

#endif// __GAME_H__


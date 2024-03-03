import React from 'react'
import { useEffect, useState } from 'react';
import { Link, Route, Routes } from "react-router-dom"
import LoadingScreen from './LoadingScreen';
import Modal from './Modal';
import useAuth from "./hooks/useAuth";
import useAxiosPrivate from './hooks/useAxiosPrivate';
import "./../style/HomePanel.css";
import { showErrorMessage } from '../util/toastdisplay';

const Home = () => {
  const { auth } = useAuth();



  const axiosPrivate = useAxiosPrivate();



  // if (isLoading) {
  //   return (<LoadingScreen />)
  // }

  return (
    <div className="HomePanel"
      style={{
        width: "100%",
        height: "100%",
      }}>
    </div>
  )
}

export default Home